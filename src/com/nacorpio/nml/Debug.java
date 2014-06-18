package com.nacorpio.nml;

import java.util.HashMap;
import java.util.Map;

import com.nacorpio.nml.util.StringUtil;

public final class Debug {

	public static void main(String[] args) {
		Map<String, String> var1 = new HashMap<String, String>();
		var1.put("Hello", "There");
		var1.put("Gay", "Boii");
		String var2 = StringUtil.getString(var1);
		Map<?, ?> map = StringUtil.getMap(var2);
		System.out.println(StringUtil.getString(map));
	}

}
