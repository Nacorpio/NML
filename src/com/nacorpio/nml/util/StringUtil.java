package com.nacorpio.nml.util;

import java.util.List;
import java.util.Map;

public final class StringUtil {

	public static final String getRegex(Object par1) {
		
		if (par1 instanceof Map<?, ?>) {
			return "\\{([key=>.*?value=>.*?],?)*\\}";
		} else if (par1 instanceof String[]) {
			return "\\{(.*?\\,?)*\\}";
		} else if (par1 instanceof Integer[]) {
			return "\\{(\\d\\,?)*\\}";
		} else if (par1 instanceof List<?>) {
			return "\\{(.*?\\,?)*\\}";
		}
		
		return ".*?";
		
	}
	
	public static final String getString(Object par1) {
		
		if (par1 instanceof String) {
			
			return par1.toString();
			
		} else if (par1 instanceof Float) {
			
			return String.valueOf(par1);
		
		} else if (par1 instanceof Integer) {
			
			return String.valueOf(par1);
			
		} else if (par1 instanceof String[]) {
			
			String var1 = "{";
			String[] var2 = (String[]) par1; // < Convert the object to a String array.
			
			for (int i = 0; i < var2.length; i++) {
				if (i < var2.length - 1) {
					var1 += var2[i] + ", ";
				} else {
					var1 += var2[i] + "}";
				}
			}
			
			return var1;
		
		} else if (par1 instanceof List<?>) {
			
			String var1 = "{";
			List<?> var2 = (List<?>) par1;
			
			for (int i = 0; i < var2.size(); i++) {
				
				String var3 = getString(var2.get(i));
				
				if (i < var2.size() - 1) {
					var1 += var3 + ", ";
				} else {
					var1 += var3 + "}";
				}
				
			}
			
			return var1;
			
		} else if (par1 instanceof Map<?, ?>) {
			
			String var1 = "{";
			Map<?, ?> var2 = (Map<?, ?>) par1;
			
			for (int i = 0; i < var2.size(); i++) {
				
				String var3 = getString(var2.keySet().toArray()[i]);
				String var4 = getString(var2.values().toArray()[i]);
				
				if (i < var2.size() - 1) {
					var1 += "[key=>" + var3 + "&val=>" + var4 + "], ";
				} else {
					var1 += "[key=>" + var3 + "&val=>" + var4 + "]}";
				}
				
			}
			
			return var1;
			
		} else if (par1 instanceof String[][]) {
			
			String var1 = "{";
			String[][] var2 = (String[][]) par1;
			
			for (int i = 0; i < var2.length; i++) {
				
				var1 += i + ":{";
				
				for (int j = 0; j < var2[i].length; j++) {
					
					if (j < var2[i].length - 1) {				
						var1 += var2[i][j] + ", ";					
					} else {			
						var1 += var2[i][j];					
					}
					
				}
				
				var1 += "}";
				
			}
			
			return var1 + "}";
			
		} else if (par1 instanceof Integer[]) {
			
			String var1 = "{";
			Integer[] var2 = (Integer[]) par1; // < Convert the object to an Integer array.
			
			for (int i = 0; i < var2.length; i++) {
				if (i < var2.length - 1) {
					var1 += var2[i] + ", ";
				} else {
					var1 += var2[i] + "}";
				}
			}
			
			return var1;
			
		} else if (par1 instanceof Float[]) {
			
			String var1 = "{";
			Float[] var2 = (Float[]) par1;
			
			for (int i = 0; i < var2.length; i++) {
				if (i < var2.length - 1) {
					var1 += var2[i] + ", ";
				} else {
					var1 += var2[i] + "}";
				}
			}
			
			return var1;
			
		} else if (par1 instanceof Byte[]) {
			
			String var1 = "{";
			byte[] var2 = (byte[]) par1;
			
			for (int i = 0; i < var2.length; i++) {
				if (i < var2.length - 1) {
					var1 += var2[i] + ", ";
				} else {
					var1 += var2[i] + "}";
				}
			}
			
			return var1;
			
		}
		
		return par1.toString();
		
	}
	
}
