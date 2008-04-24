package no.ntnu.xqft.tree.traversereturn;

import no.ntnu.xqft.parse.XQFTParser;
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
	
	
	private PathExpression pathExpression;
	private Operator tree;
	private NodeSetReturnType subType;
	
	public NodeSetReturn(PathExpression pathExpr, boolean returnLogical)
	{
		type = TraverseReturnType.NODESET;
		pathExpression = pathExpr;
		this.returnLogical = returnLogical;
		subType = pathExpression.isAbsloute() ? NodeSetReturnType.ABS_PATH_EXPR : NodeSetReturnType.REL_PATH_EXPR;
	}
	
	public NodeSetReturn(PathExpression pathExpr, boolean returnLogical, Operator tree)
	{
		this(pathExpr, returnLogical);
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
		return this.pathExpression;
	}
	
	public TraverseReturn getRestricted(TraverseReturn restrictBy, boolean returnLogical) {
		
		switch (restrictBy.type) {
		case NODESET:
			Project project, projectLeft;			//
			Select select;							//temp variables
			MergeJoin mergeJoin;					//
			Group group;							//
			
			NodeSetReturn right = (NodeSetReturn)restrictBy;				//right child - the restriction
			switch (right.getSubType()) {
			case VAR_PATH_EXPR:
			case ABS_PATH_EXPR:
				group = new Group("count()", right.getTree());
				project = new Project("[exists = ifthenelse(eq(count, 0),0,1)]", group);
				
				projectLeft = new Project("[exists = 1, documentId, position, value, scope]", this.getTree());

				mergeJoin = new MergeJoin("[exists], [exists], [documentId, position, value, scope]", projectLeft, project);
				
				project = new Project("[documentId, position, value, scope]", mergeJoin);
				
				return new NodeSetReturn(this.pathExpression, returnLogical, project);
							
			case REL_PATH_EXPR:
				mergeJoin = new MergeJoin("[documentId], [documentId], [left.position , scope = left.scope, scopeRight = right.scope, left.value]",
						this.getTree(), right.getTree());
				

				//isInScope(a, b) if a (the instance) is or is in scope b (the instance) -> true
				select = new Select("isInScope(scope, scope_prefix(" + (right.getPathExpression().getAbsContextLvl()) + ", scopeRight))", mergeJoin);
				project = new Project("[documentId, position, value, scope]", select); //to remove extra scope field
				
				return  new NodeSetReturn(pathExpression, returnLogical, project); 					


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


	public String toString()
	{
		return "NodeSet:" + getSubType() + " - " + pathExpression.toString();
	}
	

	public Operator getTree() {

		return tree;
	}

	public TraverseReturn getLogical() {
		// TODO: sjekke om dette settet er sant
		return null;
	}
	
	public TraverseReturn getCompare(int comparator, TraverseReturn compareWith) {

		String functionName = null;
		
		switch (comparator) {
		case XQFTParser.EQSi:
			functionName = "eq";
			break;
		case XQFTParser.NEQSi:
			functionName = "neq";
			break;
		case XQFTParser.LTSi:
			functionName = "lt";
			break;
		case XQFTParser.LTOREQSi:
			functionName = "leq";
			break;
		case XQFTParser.GTSi:
			functionName = "gt";
			break;
		case XQFTParser.GTOREQSi:
			functionName = "geq";
			break;
			
		case XQFTParser.EQ:
		case XQFTParser.NE:
		case XQFTParser.LT:
		case XQFTParser.LE:
		case XQFTParser.GT:
		case XQFTParser.GE:
			break;

		case XQFTParser.IS:
		case XQFTParser.NODEBEFORESi:
		case XQFTParser.NODEAFTERSi:
			break;
			
		default:
			break;
		}
		
		return null;
	}

}
