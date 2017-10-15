package com.java.test;

public class Codility1_Even {

	public static void main(String[] args) {
		int[] a = {2 ,1, 5, -6 ,9, 10023,493029,450390593, 1_999_583_095,839,9, };
		int evenCount = 0, outerIndex = 0, innerIndex = 0;
		for (;outerIndex < a.length; outerIndex++, innerIndex=outerIndex) 
			while(++innerIndex < a.length)
				evenCount = (a[outerIndex] + a[innerIndex]) % 2 == 0 ? ++evenCount : evenCount;
		System.out.println(evenCount > 1_000_000_000 ? -1 : evenCount);
	}
}
