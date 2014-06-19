package com.nacorpio.nml.api;

import java.util.ArrayList;
import java.util.List;

public class NMLCompound implements INode {

	private String name;
	private List<INode> nodes = new ArrayList<INode>();
	
	public NMLCompound(String par1) {
		this.name = par1;
	}
	
	public NMLCompound(String par1, INode... par2) {
		this.name = par1;
		addNode(par2);
	}

	/**
	 * Add the specified nodes to the compound.
	 * @param par1 the nodes.
	 * @return the compound for constructing convenience.
	 */
	public final NMLCompound addNode(INode... par1) {
		for (INode var: par1)
			addNode(var);
			return this;
	}
	
	
	/**
	 * Add the specified node to the compound.
	 * @param par1 the node.
	 * @return the compound for constructing convenience.
	 */
	public final NMLCompound addNode(INode par1) {
		if (!hasNode(par1.getName())) {
			nodes.add(par1);
		}
		return this;
	}
	
	/**
	 * Returns a node with the specified name.
	 * @param par1 the name.
	 * @return the node.
	 */
	public final INode getNode(String par1) {
		if (hasNode(par1)) {
			for (INode var: nodes) {
				if (var.getName().equals(par1))
					return var;
			}
		}
		return null;
	}
	
	/**
	 * Remove the nodes with the specified names.
	 * @param par1 the names.
	 * @return the compound for constructing convenience.
	 */
	public final NMLCompound removeNode(String... par1) {
		for (String var: par1)
			removeNode(var);
			return this;
	}
	
	/**
	 * Remove the node with the specified name.
	 * @param par1 the name.
	 * @return the compound for constructing convenience.
	 */
	public final NMLCompound removeNode(String par1) {
		if (hasNode(par1)) {
			for (INode var: nodes) {
				if (var.getName().equals(par1))
					nodes.remove(var);
			}
		}
		return this;
	}
	
	/**
	 * Returns whether this compound contains a node with the specified name.
	 * @param par1 the name.
	 * @return whether this compound consists of a node with the specified name.
	 */
	public final boolean hasNode(String par1) {
		for (INode var: nodes) {
			if (var.getName().equals(par1))
				return true;
		}
		return false;
	}
	
	private final String getNodesString(boolean par1) {
		String var1 = "";
		for (int i = 0; i < nodes.size(); i++) {
			if (i < nodes.size() - 1) {
				var1 += (par1 ? "\n" : "") + nodes.get(i) + (par1 ? "\n" : "");
			} else {
				var1 += nodes.get(i) + (par1 ? "\n" : "");;
			}
		}
		return var1;
	}
	
	public final String getName() {
		return name;
	}
	
	/**
	 * Returns the String representation of this compound.
	 */
	public final String toString() {
		return "<node name=\"" + name + "\" type=\"compound\">" + getNodesString(true) + "</node>";
	}
	
	public final boolean isCompound() {
		return true;
	}

}
