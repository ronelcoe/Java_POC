package com.coding.game;

import java.util.Arrays;

public class FindClosestToZero {

	static int getClosestToZero(int[] ints) {
		int positiveNumber = 0, negativeNumber = 0; 
		return ((positiveNumber = Arrays.stream(ints).filter(x -> x >= 0).min().getAsInt()) <= 
				Math.abs(negativeNumber = Arrays.stream(ints).filter(x -> x < 0).max().getAsInt())) ? positiveNumber : negativeNumber ;
	}


	public static void main(String[] args) {
		int[] ints = { -9, 8, -2, -5, 7, -1, 12,};
		System.out.println(getClosestToZero(ints));
	}

}
