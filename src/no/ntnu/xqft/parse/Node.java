///**
// * Copyright (c) 2007 Andreas Ravnestad, Mads Nyborg, 
// *                    Norwegian University of Science and Technology (NTNU),
// *                    Fast Search & Transfer
// *
// * All rights reserved.
// *
// * Redistribution and use in source and binary forms, with or without
// * modification, are permitted provided that the following conditions are met:
// *     * Redistributions of source code must retain the above copyright
// *       notice, this list of conditions and the following disclaimer.
// *     * Redistributions in binary form must reproduce the above copyright
// *       notice, this list of conditions and the following disclaimer in the
// *       documentation and/or other materials provided with the distribution.
// *     * Neither the name of the university nor the
// *       names of its contributors may be used to endorse or promote products
// *       derived from this software without specific prior written permission.
// *
// * THIS SOFTWARE IS PROVIDED BY ITS COPYRIGHT HOLDERS ``AS IS'' AND ANY
// * EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
// * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
// * DISCLAIMED. IN NO EVENT SHALL COPYRIGHT HOLDERS BE LIABLE FOR ANY
// * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
// * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
// * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
// * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
// * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
// * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
// */
//
//package no.ntnu.xqft.parse;
//
//import java.util.*;
//
///**
// * This class represents a node in a syntax tree, with zero or
// * more children.
// * 
// */
//public class Node
//{
//	private int bytePosition; /* Position of word (node) in input */ 
//	private String value; /* String value of the node (some word) */
//	private LinkedList<Node> children = new LinkedList<Node>();
//
//	/**
//	 * Constructs a single leaf node with a given
//	 * string value;
//	 */
//	public Node(String value, int pos)
//	{
//		this.setValue(value);
//		this.setBytePosition(pos);
//	}
//
//	/**
//	 * Constructs a linked node with a single child
//	 */
//	public Node(Node child)
//	{
//		this.children.add(child);
//	}
//
//	/**
//	 * Constructs a linked node with two children
//	 */
//	public Node(Node left, Node right)
//	{
//		this.children.add(left);
//		this.children.add(right);
//	}
//	
//	/**
//	 * @return the string value
//	 */
//	public String getValue()
//	{
//		return value;
//	}
//
//	/**
//	 * @param value the string value to set
//	 */
//	public void setValue(String value)
//	{
//		this.value = value.trim().toLowerCase();
//	}
//
//	/**
//	 * @return the children
//	 */
//	public LinkedList<Node> getChildren()
//	{
//		return children;
//	}
//
//	/**
//	 * @param children the children to set
//	 */
//	public void setChildren(LinkedList<Node> children)
//	{
//		this.children = children;
//	}
//
//	/* (non-Javadoc)
//	 * @see java.lang.Object#hashCode()
//	 */
//	@Override
//	public int hashCode()
//	{
//		return value.hashCode();
//	}
//
//	/* (non-Javadoc)
//	 * @see java.lang.Object#toString()
//	 */
//	@Override
//	public String toString()
//	{
//		return this.value;
//	}
//
//	/**
//	 * @return the bytePosition
//	 */
//	public int getBytePosition()
//	{
//		return bytePosition;
//	}
//
//	/**
//	 * @param bytePosition the bytePosition to set
//	 */
//	public void setBytePosition(int bytePosition)
//	{
//		this.bytePosition = bytePosition;
//	}
//}