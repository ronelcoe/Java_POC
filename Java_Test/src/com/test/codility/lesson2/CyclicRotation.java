package com.test.codility.lesson2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class CyclicRotation {

	static int[] solution(int[] arrayNumbers, int movement) {
		if (arrayNumbers == null || arrayNumbers.length == 0)
			return new int[0];
		
		if (movement > arrayNumbers.length)
			movement = movement % arrayNumbers.length;
		
		LinkedList<Integer> ll = new LinkedList<>();
		ll.addAll(Arrays.stream(arrayNumbers).boxed().collect(Collectors.toList()));
		
		while(movement-- > 0) {
			ll.push(ll.removeLast());
		}

		movement = 0;
		while(movement < arrayNumbers.length)
			arrayNumbers[movement] = ll.get(movement++);
		
		Arrays.stream(arrayNumbers).forEach(x -> System.out.print(x + " "));
		
		return arrayNumbers;
	}
	
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		int[] arrayNumbers = {5, 3, 4, 6, 10};
		solution(arrayNumbers, 3);
		
		System.out.println("\nElapse Time: " + (System.currentTimeMillis() - startTime));
	}
}
