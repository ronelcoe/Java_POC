package com.test.hackerrank;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SwapArrayOddEven {
	
	static int moves(int[] a) {
//		int[] a = {5, 8, 5, 11, 4, 6};
		int oddMaxIndex = 0, maxEvenIndex = a.length-1, moveCount = 0;		
		for(int iterator = 0; iterator < a.length; iterator++) {
			
			while ((a[iterator] % 2) == 0) {
				++iterator;
				oddMaxIndex = iterator;
			}
			
			while((a[maxEvenIndex] % 2) != 0) {
				maxEvenIndex-=1;
			}
			
			if(maxEvenIndex <= oddMaxIndex)
				break;
			else
				moveCount++;
			
			int tmp = a[oddMaxIndex];
			a[oddMaxIndex] = a[maxEvenIndex];
			a[maxEvenIndex] = tmp;
		}
		
		return moveCount;
    }

	public static void main(String[] args) {
//		int[] a = {5, 8, 5, 11, 4, 6};
		int[] a = {4,13,10,21,20};
		System.out.println(moves(a));
	}
}
