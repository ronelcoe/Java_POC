package com.coding.game;

public class GFITest2 {
	
	static boolean check(String str) {
		char[] pattern = str.toCharArray();
		for (int x = 0, y = pattern.length - 1; x < y ; x++, y--) {
			System.out.println(" " + Character.getName(pattern[x]).toString().substring(5) + " " + Character.getName(pattern[y]).toString().substring(5) + " : " + x);
			if (Character.getName(pattern[x]).toString().substring(5).equals(Character.getName(pattern[y]).toString().substring(5)) ) {
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		System.out.println(GFITest2.check("[()]"));   // true
//		System.out.println(GFITest2.check("(()[])")); // true
//		System.out.println(GFITest2.check("([)]"));   // false
//		GFITest2.check("((");
//		System.out.println(GFITest2.check("(("));     // false
//		System.out.println(GFITest2.check("[(()])")); // false

//		System.out.println(GFITest2.check("([(([[(([]))]]))])"));   // true
//		System.out.println(GFITest2.check("[](()()[[]])()[]([])")); // true
//		System.out.println(GFITest2.check("([((([(([]))])))))])")); // false
//		System.out.println(GFITest2.check("[](()()[[]])[][[([])")); // false
	}

}
