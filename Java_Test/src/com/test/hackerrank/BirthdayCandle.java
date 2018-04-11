package com.test.hackerrank;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BirthdayCandle {

	static int birthdayCakeCandles(int n, int[] ar) {
        List<Integer> intList = Arrays.stream(ar).boxed().collect(Collectors.toList());
        Collections.sort(intList);
        int max = intList.get(intList.size()-1);
        intList.removeIf(x -> x != max);
        return intList.size();
    }
	public static void main(String[] args) {
		int[] ar = {3, 2, 1, 3};
//		int[] ar = {9999999, 9999999, 9999999, 9999999};
		System.out.println(birthdayCakeCandles(4, ar));
	}

}
