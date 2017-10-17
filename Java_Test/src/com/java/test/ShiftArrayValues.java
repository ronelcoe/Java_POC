package com.java.test;

import java.util.Arrays;

public class ShiftArrayValues {

	public static void main(String[] args) {
		int[] arrayNumbers = {5, 3, 4, 6, 10};
		Arrays.stream(arrayNumbers).forEach(x -> System.out.print(x + " "));
		System.out.println("");
		int movement = 2;
		int[] tmpArrayNumbers = arrayNumbers.clone();
//		Arrays.stream(tmpArrayNumbers).forEach(x -> System.out.print(x + " "));
		System.out.println("");
		
		if (movement > arrayNumbers.length)
			movement = movement % arrayNumbers.length;
		
		for(int x = 0; x < arrayNumbers.length; x++) {
			if (x + movement < arrayNumbers.length)
				System.arraycopy(arrayNumbers, x, tmpArrayNumbers, x + movement, 1);
			else 
				System.arraycopy(arrayNumbers, x, tmpArrayNumbers, (x + movement) - arrayNumbers.length, 1);
		}
		Arrays.stream(tmpArrayNumbers).forEach(x -> System.out.print(x + " "));
	}
}
