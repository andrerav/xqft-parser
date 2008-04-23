package no.ntnu.xqft.tree.traversereturn;

import no.ntnu.xqft.tree.PathExpression;
import no.ntnu.xqft.tree.operator.Group;
import no.ntnu.xqft.tree.operator.MergeJoin;
import no.ntnu.xqft.tree.operator.Operator;
import no.ntnu.xqft.tree.operator.Project;
import no.ntnu.xqft.tree.operator.Select;

public class NodeSetReturn extends TraverseReturn {

	public enum NodeSetReturnType{
		ABS_PATH_EXPR,
		REL_PATH_EXPR,
		VAR_PATH_EXPR,					//pathExpression stored in a variable
	}
	
	
	private PathExpression pathExpresion;
	private Operator tree;
	private NodeSetReturnType subType;
	
	public NodeSetReturn(PathExpression pathExpr, boolean nodeForNodeMode)
	{
		type = TraverseReturnType.NODESET;
		pathExpresion = pathExpr;
		this.nodeForNodeMode = nodeForNodeMode;
		subType = pathExpresion.isAbsloute() ? NodeSetReturnType.ABS_PATH_EXPR : NodeSetReturnType.REL_PATH_EXPR;
	}
	
	public NodeSetReturn(PathExpression pathExpr, boolean nodeForNodeMode, Operator tree)
	{
		this(pathExpr, nodeForNodeMode);
		this.tree = tree;
	}
	

	public NodeSetReturnType getSubType()
	{
		return subType;
	}
	
	public void setSubType(NodeSetReturnType subType)
	{
		this.subType = subType;
	}
	
	public PathExpression getPathExpression()
	{
		return this.pathExpresion;
	}
	
	public TraverseReturn getRestricted(TraverseReturn restrictBy, boolean nodeForNodeMode) {
		
		switch (restrictBy.type) {
		case NODESET:
			Project project, projectLeft;			//
			Select select;							//temp variables
			MergeJoin mergeJoin;					//
			Group group;							//
			
			NodeSetReturn right = (NodeSetReturn)restrictBy;				//right child - the restriction
			switch (right.getSubType()) {
			case ABS_PATH_EXPR:
				group = new Group("count()", right.getTree());
				project = new Project("[exists = ifthenelse(eq(count, 0),0,1)]", group);
				
				projectLeft = new Project("[exists = 1, documentId, position, value, scope]", this.getTree());

				mergeJoin = new MergeJoin("[exists], [exists], [documentId, position, value, scope]", projectLeft, project);
				
				project = new Project("[documentId, position, value, scope]", mergeJoin);
				
				return new NodeSetReturn(this.pathExpresion, nodeForNodeMode, project);
							
			case VAR_PATH_EXPR:
			case REL_PATH_EXPR:
				mergeJoin = new MergeJoin("[documentId], [documentId], [left.position , scope = left.scope, scopeRight = right.scope, left.value]",
						this.getTree(), right.getTree());
				

				//isInScope(a, b) if a (the instance) is or is in scope b (the instance) -> true
				select = new Select("isInScope(scope, scope_prefix(" + (right.getAbsContextLvl()) + ", scopeRight))", mergeJoin);
				project = new Project("[documentId, position, value, scope]", select); //to remove extra scope field
				
				return  new NodeSetReturn(pathExpresion, nodeForNodeMode, project); 					


			default:
				System.err.println("JOIN ERROR: Trying to restrict a " + this.type + ":" + this.getSubType() + " with a "
						+ right.type + " " + right.getSubType());
				break;
			}
			
			break;

		default:
			System.err.println("JOIN ERROR: Trying to restrict a " + type +"(" + this.toString() + ")" + " with a " + restrictBy.type + "(" + restrictBy + ")");
			break;
		}
		return null;
	}

	private Integer getAbsContextLvl() {
		switch (subType) {
		case ABS_PATH_EXPR:
		case REL_PATH_EXPR:
			return pathExpresion.getAbsContextLvl();
			
		case VAR_PATH_EXPR: //TODO: gjetter, dette må testes
			return pathExpresion.noOfSteps();

		default:
			return null;
		}
	}

	public String toString()
	{
		return "NodeSet: " + pathExpresion.toString();
	}
	

	public Operator getTree() {

		return tree;
	}

}
