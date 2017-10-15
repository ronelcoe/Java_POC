package com.test.lamda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lamda_ArrayList {

	public static void main(String[] args) {
		List<String> items = new ArrayList<>();
		items.add("C");
		items.add("E");
		items.add("B");
		items.add("A");
		items.add("D");

//		items.forEach(item -> System.out.println(item)) ;
//		items.forEach(item -> {
//			if ("A".equals(item))
//				System.out.println("A nga");
//			System.out.println(item);
//		});
		
		Collections.sort(items);
		items.forEach(item -> System.out.println(item));
		
	}

}
