package no.ntnu.xqft.tree.traversereturn;

import java.util.ArrayList;

public class VarReferences {
	
	public enum VarRefType
	{
		TRUESandFALSES,
		TRUEorFALSE,
	}
	
	private ArrayList<VarRef> varRefList;

	public VarReferences()
	{
		varRefList = new ArrayList<VarRef>();
	}
	
	public VarReferences add(VarReferences varRefs)
	{
		varRefList.addAll(varRefs.varRefList);
		return this;
	}
	
	public boolean contains(String varName, VarRefType type)
	{
		return varRefList.contains(new VarRef(varName, type));
	}
	
	public void remove(String varName)
	{
		for(int i = 0; i< varRefList.size(); )
		{
			if(varRefList.get(i).varName.equals(varName))
				varRefList.remove(i);
			else
				i++;
		}
	}
	
	public void add(String varName, VarRefType type)
	{
		varRefList.add(new VarRef(varName, type));
	}
	
	
	private class VarRef{
		public String varName;
		public VarRefType type;
		
		public VarRef(String name, VarRefType t)
		{
			varName = name;
			type = t;
		}
		
		public boolean equals(VarRef other)
		{
			return (varName.equals(other.varName) && type == other.type);
		}
	}
}
