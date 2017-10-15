package com.test.lamda;

import java.util.HashMap;
import java.util.Map;

public class LamdaHashMapTest {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>(); 
		map.put("A", "a");
		map.put("B", "b");
		map.put("C", "c");
		map.put("D", "d");

		map.forEach((k,v) -> System.out.println(k));
	}

}
