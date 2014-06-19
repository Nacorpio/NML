package com.nacorpio.nml.api;

public interface INode {

	/**
	 * Returns the name of the node.
	 * @return the name.
	 */
	String getName();
	
	/**
	 * Returns whether the node is a compound which can store nodes.
	 * @return whether this is a compound.
	 */
	boolean isCompound();
	
}
