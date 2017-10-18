package com.test.codility.lesson2;

import java.util.HashSet;

public class OddOccurrencesInArray {
	static int solution(int numbers[]) {
		HashSet<Integer> hs = new HashSet<>();
		for (int x : numbers) {
			if (hs.contains(x))
				hs.remove(x);
			else
				hs.add(x);
		}
		return (int) hs.toArray()[0];
	}
	
	public static void main(String[] args) {
		int numbers[] = {9, 3, 9, 3, 9, 7, 9}; 
		System.out.println(solution(numbers));
	}

}
