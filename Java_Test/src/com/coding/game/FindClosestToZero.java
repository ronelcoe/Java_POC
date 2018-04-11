package com.coding.game;

import java.util.Arrays;

public class FindClosestToZero {

	static int getClosestToZero(int[] ints) {
		int positiveNumber, negativeNumber;
//		Arrays.stream(ints).filter(x -> x >= 0).min().orElseGet(x -> positiveNumber = x);
//		Arrays.stream(ints).filter(x -> x < 0).max().ifPresent(x -> System.out.println(x));
		
//		System.out.println("" + positiveNumber + " : " + negativeNumber);
//		if (Arrays.stream(ints).filter(x -> x >= 0).min().isPresent())
//			positiveNumber = Arrays.stream(ints).filter(x -> x >= 0).min().getAsInt();
//		if (Arrays.stream(ints).filter(x -> x < 0).max().isPresent())
//			negativeNumber = Arrays.stream(ints).filter(x -> x < 0).max().getAsInt();
//		
//		return (Arrays.stream(ints).filter(x -> x >= 0).min().isPresent() && positiveNumber <= Math.abs(negativeNumber)) ? positiveNumber : negativeNumber ;
		return 0;
//		return positiveNumber <= Math.abs(negativeNumber) ? positiveNumber : negativeNumber ; 
	}

	public static void main(String[] args) {
		int[] ints = { -9, -8, -2, -5, -7, -1, -12,};
		System.out.println(getClosestToZero(ints));
	}

}
