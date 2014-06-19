package com.nacorpio.nml.data;

import java.util.ArrayList;
import java.util.List;

import com.nacorpio.nml.api.INode;

public class NMLBase {

	private String name;
	private List<INode> nodes = new ArrayList<INode>();
	
	/**
	 * Create a new NML Base with a unique name.
	 * @param par1 the name.
	 */
	public NMLBase(String par1) {
		this.name = par1;
	}
	
	/**
	 * Returns the name of the base.
	 * @return the name.
	 */
	public final String getName() {
		return this.name;
	}
	
	/**
	 * Adds the specified node to the collection.
	 * @param par1 the node.
	 */
	public final void addNode(INode par1) {
		if (!hasNode(par1.getName())) {
			nodes.add(par1);
		}
	}
	
	/**
	 * Returns whether a node with the specified name exists.
	 * @param par1 the name.
	 * @return whether the node exists.
	 */
	public final boolean hasNode(String par1) {
		for (INode var: nodes) {
			if (var.getName().equals(par1))
				return true;
		}
		return false;
	}
	
	/**
	 * Returns the nodes of this base.
	 * @return the nodes.
	 */
	public final List<INode> getNodes() {
		return this.nodes;
	}
	
}
