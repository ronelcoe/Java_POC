package com.java.test;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String, String> hs = new HashMap<>();
		hs.put("a", "A");
		hs.put("d", "D");
		hs.put(null, "B");
		hs.put("f", "F");
		hs.put(null, "C");
		hs.put("e", "E");
		hs.put(new String("f"), "E");
		hs.forEach((k, v) -> System.out.println(k + ": " +  v ));
		
//		System.out.println(" " + "f".hashCode() + " : " +  (new String("f")).hashCode());
		
		System.out.println("d".hashCode() + " " + hs.size());
		System.out.println("d".hashCode() & hs.size());
		
//		System.out.println(2 & 4);
//		System.out.println(2 & 2);
	}

}
