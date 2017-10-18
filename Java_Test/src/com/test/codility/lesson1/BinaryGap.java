package com.test.codility.lesson1;

import java.util.Comparator;
import java.util.stream.Stream;

public class BinaryGap {
	
	static int solution(int number) {
		String binaryNumber = Integer.toBinaryString(number);
		return ("0".equals(binaryNumber) || !binaryNumber.substring(0, binaryNumber.lastIndexOf("1")).contains("0")) ? 0 : 
			Stream.of(binaryNumber.substring(0, binaryNumber.lastIndexOf("1")).split("1")).max(Comparator.naturalOrder()).get().length();
	}

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		System.out.println(solution(1039));
		System.out.println("\nElapse Time: " + (System.currentTimeMillis() - startTime));
	}

}
