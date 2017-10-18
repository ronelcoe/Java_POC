package com.test.codility.lesson6;

import java.util.Arrays;

public class Distinct {

	static int solution(int[] numbers) {
		Arrays.sort(numbers);
		return (int) Arrays.stream(numbers).distinct().count();
	}

	public static void main(String[] args) {
		int numbers[] = {2, 1, 4, 3, 1, 2, 3, 1};
		System.out.println(solution(numbers));
	}
}
