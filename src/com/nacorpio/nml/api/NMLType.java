package com.nacorpio.nml.api;

import java.util.ArrayList;
import java.util.List;

import com.nacorpio.nml.util.StringUtil;

public class NMLType<T> implements INode {

	private String name;
	private T value;
	
	private Class<?> clazz;
	
	public NMLType(String par1, T par2) {
		this.name = par1;
		this.value = par2;
		this.clazz = value.getClass();
	}
	
	public final String getName() {
		return this.name;
	}
	
	public final T getValue() {
		return this.value;
	}
	
	public final Class<?> getType() {
		return this.clazz;
	}
	
	public String toString() {
		return "<node name=\"" + name + "\" type=\"" + getType().getName() + "\">" + StringUtil.getString(value) + "</node>";
	}

	@Override
	public boolean isCompound() {
		return false;
	}
	
}
