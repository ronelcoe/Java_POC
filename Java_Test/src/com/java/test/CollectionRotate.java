package com.java.test;

import java.util.ArrayList;
import java.util.List;

public class CollectionRotate {
	
	private static String test(String[] a, String[] b) {
		return "";
	}

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>();
		l1.add("abcd");
		l1.add("dcba");
		l1.add("abcd");
		
		List<String> l2 = new ArrayList<>();
		l1.add("abcd");
		l1.add("abcd");
		l1.add("abcdcd");
		
//		test(l1.get(0).toCharArray(),l2.get(0).toCharArray());
		String[] a = {"c","d","a","b"};
		String[] b = {"a","b","c","d"};
		
		System.out.println(test(a,b));
	}

}
