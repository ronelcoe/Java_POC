package com.java.test;

public class Codility3_String_Rules {

	public static String transform(String x) {
		switch(x) {
			case "AB" : return "AA";
			case "BA" : return "AA";
			case "CB" : return "CC";
			case "BC" : return "CC";
			case "AA" : return "A";
			case "CC" : return "C";
		}
		return "";
	}
	
	public static void main(String[] args) {
		String x = "ABBCC";
		StringBuilder sb = new StringBuilder(x);
		int index = 0;
		
		while (sb.length() > 2) {
			String tmpTransformed = transform(sb.substring(index, index + 1) + sb.substring(index + 1, index + 2));
			if (tmpTransformed.length() > 0) { 
				sb.delete(index, index + 2).insert(index, tmpTransformed);
			} else {
				++index;
			}
		}
		System.out.println(sb);
	}
}
