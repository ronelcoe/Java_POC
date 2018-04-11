package com.java.test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayToLinkedList {

	public static void main(String[] args) {
		String[] sa = new String[] { "A", "B", "C" };
		LinkedList<String> ll = new LinkedList(Arrays.asList(sa));
		
		ll.pop();

		// iterate over each element in LinkedList and show what is in the list.
		Iterator iterator = ll.iterator();
		while (iterator.hasNext()) {
			// Print element to console
			System.out.println((String) iterator.next());
		}
		
		Integer[] nums = {3, 6, 8, 1, 5};      
		List<Integer> list = Arrays.asList(nums);
		for(int x : list) {
			System.out.println(x);
		}
	}
		

}
