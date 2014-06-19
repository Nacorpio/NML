package com.nacorpio.nml;

import com.nacorpio.nml.api.NMLCompound;
import com.nacorpio.nml.api.NMLString;

public final class Debug {

	public static void main(String[] args) {
		NMLCompound var1 = new NMLCompound("root");
		var1.addNode(new NMLCompound("branch"));
		var1.addNode(new NMLString("leaf", "value"));
		System.out.println(var1);
	}

}
