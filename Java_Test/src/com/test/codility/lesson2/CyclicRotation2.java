package com.test.codility.lesson2;

import java.util.Arrays;

public class CyclicRotation2 {

	public static int[] solution(int[] arrayNumbers, int movement) {
		int[] tmpArrayNumbers = null;
		if (arrayNumbers == null || arrayNumbers.length == 0)
			return new int[0];
		else
			tmpArrayNumbers = arrayNumbers.clone();

		if (movement > arrayNumbers.length)
			movement = movement % arrayNumbers.length;

		for (int x = 0; x < arrayNumbers.length; x++) {
			if (x + movement < arrayNumbers.length)
				System.arraycopy(arrayNumbers, x, tmpArrayNumbers, x + movement, 1);
			else
				System.arraycopy(arrayNumbers, x, tmpArrayNumbers, (x + movement) - arrayNumbers.length, 1);
		}
		Arrays.stream(tmpArrayNumbers).forEach(x -> System.out.print(x + " "));
		return tmpArrayNumbers;
	}

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		int[] arrayNumbers = { 5, 3, 4, 6, 10 };

		solution(arrayNumbers, 19);

		System.out.println("\nElapse Time: " + (System.currentTimeMillis() - startTime));
	}

}
