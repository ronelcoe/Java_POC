package com.coding.game;

import java.util.Arrays;

public class FindBinarySearch {

	private static boolean exists(int[] ints, int k) {
		return Arrays.binarySearch(ints, k) >= 0 ? true : false;
	}

	public static void main(String[] args) {
		int[] ints = {-9, 14, 37, 102};
		System.out.println(exists(ints, 102)); // true
		System.out.println(exists(ints, 36)); // false
	}

}
