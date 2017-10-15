package com.java.test;

import java.util.HashMap;
import java.util.Map;

public class ReadStringTest {
	private static Map<Character, Integer> myStringMap = new HashMap<Character, Integer>() ;
	
	public ReadStringTest(String yourString) {
		this.buildMap(yourString);
	}
	
	//Building keys
	private void buildMap(String myString) {
		for(char c : myString.toCharArray()) {
			myStringMap.put(c, myStringMap.containsKey(c) ? myStringMap.get(c) + 1 : 1);
		}
	}
	
	//Printing each key and value
	public void printNumberOfChar() {
		myStringMap.keySet().forEach(key -> System.out.println(key + " = " + myStringMap.get(key)));
	}
}