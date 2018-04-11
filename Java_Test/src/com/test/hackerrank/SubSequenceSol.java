package com.test.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class SubSequenceSol {
//
//	static int longestSubsequence(String x, String y) {
//		StringBuilder sb1 = new StringBuilder(x);
//		StringBuilder sb2 = new StringBuilder(y);
//		
//		System.out.println(x.subSequence(0, 4));
//		for(int outerIterator = 0; outerIterator < x.toCharArray().length; outerIterator++) {
//			
//		}
//		
//		return 0;
//	}
	
	static int longestSubsequence(String x, String y) {
		char[] xC = x.toCharArray();
		char[] yC = y.toCharArray();
		List<String> xList = new ArrayList<String>();
		List<String> yList = new ArrayList<String>();

		for (int i = 0; i < (1<<xC.length); i++)
		{
			StringBuilder xTemp = new StringBuilder();
			for (int j = 0; j < xC.length; j++)
				if ((i & (1 << j)) > 0)
					xTemp.append(xC[j]);
					
			xList.add(String.valueOf(xTemp));
		}
//		xList.forEach(System.out::println);
		
		for (int i = 0; i < (1<<yC.length); i++)
		{
			StringBuilder yTemp = new StringBuilder();
			for (int j = 0; j < yC.length; j++)
				if ((i & (1 << j)) > 0)
					yTemp.append(yC[j]);
					
			yList.add(String.valueOf(yTemp));
		}
//		yList.forEach(System.out::println);
		
		int maxLength = 0;
		for(String yString : yList) {
			if (xList.contains(yString) && yString.length() > maxLength) {
				maxLength = yString.length();
				System.out.println(yString + " " + maxLength);
			}
		}
		
		return maxLength;
	}

	public static void main(String[] args) {
		System.out.println(longestSubsequence("abc", "aedace"));
	}

}
