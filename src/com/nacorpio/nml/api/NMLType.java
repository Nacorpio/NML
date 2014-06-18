package com.nacorpio.nml.api;

public class NMLType<T> {

	private String name;
	private T value;
	
	private Class<?> clazz = value.getClass();
	
	public NMLType(String par1, T par2) {
		this.name = par1;
		this.value = par2;
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
	
	public final String toString() {
		return "<node name=\"" + name + "\" type=\"" + getType().getName() + "\">" + value.toString() + "</node>";
	}
	
}
