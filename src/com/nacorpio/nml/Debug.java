package com.nacorpio.nml;

import java.util.HashMap;
import java.util.Map;

import com.nacorpio.nml.util.StringUtil;

public final class Debug {

	public static void main(String[] args) {
		Map<String, String> var1 = new HashMap<String, String>();
		var1.put("Hello", "There");
		var1.put("Gay", "Boii");
		System.out.println(StringUtil.getString(var1));
	}

}
