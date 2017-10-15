package com.coding.game;

import java.util.Arrays;

public class GFITest1 {
	
	static int getClosestToZero(int[] ints) {
		int closestIndex = -1;
		Arrays.sort(ints);
		for (int x = 0, y = 0; x < ints.length; ++x, --y) {
			System.out.println(Arrays.toString(ints));
			System.out.println(x + " " + y + " " + Arrays.binarySearch(ints, x) + " " + Arrays.binarySearch(ints, y));
			closestIndex = Arrays.binarySearch(ints, x) >= 0 ? Arrays.binarySearch(ints, x) : Arrays.binarySearch(ints, y) >= 0 ? Arrays.binarySearch(ints, y) : -1;
			System.out.println("closestIndex: " + closestIndex );
			if (closestIndex >= 0)	break;
		}
		return ints[closestIndex];
	}
	
	
	public static void main(String[] args) {
		int[] ints = { -9, 8, 2, -5, 7, -1 };
		System.out.println(getClosestToZero(ints));
	}
}
