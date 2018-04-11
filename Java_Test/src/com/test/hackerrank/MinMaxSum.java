package com.test.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinMaxSum {
	static void miniMaxSum(int[] arr) {
		int ignore = 0, sum = 0;
		List<Integer> sumList = new ArrayList<Integer>();
		for(int iterator = 0; iterator < arr.length; iterator++) {
			if(ignore != iterator)
				sum+=arr[iterator];

			if (ignore == arr.length) {
				Collections.sort(sumList);
				break;
			} else if (iterator == arr.length-1) {
				iterator=-1;
				++ignore;
				sumList.add(sum);
				sum = 0;
			}
		}
		System.out.print(sumList.get(0) + " " + sumList.get(sumList.size()-1));
	}
	
	public static void main(String[] args) {
		int[] input = {1,2,3,4,5};
		miniMaxSum(input);
	}
}
