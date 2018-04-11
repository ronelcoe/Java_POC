package com.test.codility.lesson3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TapeEquilibrium {
	
//	static int solution(int[] arrayNumbers) {
//		if (arrayNumbers == null || arrayNumbers.length == 0)
//			return 0;
//		
//		int lowerStart = 0, lowerSum = 0, upperSum = 0, upperStart = 0, minResult = 0;
//		for(int x = 0; x < arrayNumbers.length; x++) {
//			lowerStart = 0;
//			lowerSum = 0;
//			while(lowerStart <= x) 
//				lowerSum += arrayNumbers[lowerStart++];
//			
//			upperSum = 0;
//			upperStart = x + 1;
//			while(upperStart < arrayNumbers.length) 
//				upperSum += arrayNumbers[upperStart++];
//			
//			minResult = minResult == 0 ? Math.abs(lowerSum - upperSum) : Math.abs(lowerSum - upperSum) < minResult ? Math.abs(lowerSum - upperSum) : minResult; 
//		}
//		
//		return minResult;
//	}
	
	static int solution(int[] arrayNumbers) {
		List<Integer> intList = Arrays.stream(arrayNumbers).boxed().collect(Collectors.toList());
		
		
		return 0 ;
	}

	public static void main(String[] args) {
		int arrayNumbers[] = {3, 1, 2, 4, 3};
		System.out.println(solution(arrayNumbers));
	}

}
