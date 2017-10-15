package com.test.codility;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayPairTest {

	public static int testPair(int[] numbers) {
		List<Integer> numberList = Arrays.stream(numbers).boxed().collect(Collectors.toList());
		int unPaired = 0;
//		Collections.sort(numberList);
//		for(int x = 0; x < numberList.size()-2; x+=2) {
//			if (numberList.get(x) != numberList.get(x+1)) {
//				unPaired = numberList.get(x);
//				break;
//			}
//		}
		
		Map<Integer, Integer> numberMap = new HashMap<Integer, Integer>();
		numberList.forEach(number -> { 
			numberMap.put(number, numberMap.containsKey(number) ? numberMap.get(number) + 1 : 1);
		});

//		numberMap.keySet().forEach(key -> System.out.println(key + " = " + numberMap.get(key)));
//		System.out.println(numberMap.keySet());
		
		for(Integer x : numberMap.keySet()) {
			if (numberMap.get(x) == 1) {
				unPaired = x;
				break;
			}
		}
		return unPaired;
	}

	public static void main(String[] args) {
		int[] numbers = {9, 3, 9, 3, 9, 7, 9};
		System.out.println(testPair(numbers));
	}

}
