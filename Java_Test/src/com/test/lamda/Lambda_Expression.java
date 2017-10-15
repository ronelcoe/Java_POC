package com.test.lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Lambda_Expression {

	public static boolean checkList(List list, Predicate<List> p) {       
		return p.test(list);    
	}           

	public static void main(String[] args) {
		//		() -> System.out.println("Hello Lamda");
		//		x -> x + 10;
//		boolean b = checkList(new ArrayList(), al -> al.isEmpty());
//		boolean b = checkList(new ArrayList(), al -> return al.size() == 0);
//		boolean b = checkList(new ArrayList(), (ArrayList al) -> al.isEmpty());
		boolean b = checkList(new ArrayList(), al -> al.add("hello"));
//		boolean b = checkList(new ArrayList(), ArrayList al -> al.isEmpty());
		System.out.println(b);    
		
		
//		checkList(new ArrayList(), () -> "Hello");
//		() -> System.out.println("Hello")
//		(String str) -> str.length()
//		(str) -> str.length()
//		str -> str.length()
//		(int i, int j) -> i + j
//		(i, j) -> i + j
//
//		() -> {
//		    System.out.println("Hello");
//		    System.out.println("World");
//		}
//
//		(int i) -> {
//		    System.out.println("Hello");
//		    return i;
//		}
	}

	private static void checkList(ArrayList list, Object p) {
		System.out.println(p);
	}

}
