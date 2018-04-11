package com.coding.game;

import java.util.regex.Pattern;

public class StringMatcher {

	public static void main(String[] args) {
		String x = "dantfgjlant43dsa2432sdfg";
		String s = "ant*sa";
		
		if(Pattern.matches(".*ant.*sa.*", x)) {
			System.out.println(x.indexOf(s.substring(0, s.indexOf("*"))));
		}
		
		System.out.println(x.indexOf(s));
	}

}
