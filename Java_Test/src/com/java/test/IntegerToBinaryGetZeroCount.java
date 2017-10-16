package com.java.test;

public class IntegerToBinaryGetZeroCount {

	public static int getNumberOfZeroInBetween(int number) {
		int maxZeroCount = 0, tmpMaxZeroCount = 0;
		char c[] = Integer.toBinaryString(number).toCharArray();
		System.out.println(c);
		for(int counter = 0; counter < c.length; counter++ ) {
			if(counter+1 < c.length && c[counter] == '1' && c[counter+1] == '0') {
				while (++counter < c.length && c[counter] == '0') {
					++tmpMaxZeroCount;
				}
			}
			//check if last digit is 1
			if (tmpMaxZeroCount > maxZeroCount && c[counter] == '1') {
				maxZeroCount = tmpMaxZeroCount;
				--counter;
			}
				
			//reset tmp counter
			tmpMaxZeroCount = 0;
		}
		return maxZeroCount;
	}

	public static void main(String[] args) {
		int x = 1111;
		System.out.println(getNumberOfZeroInBetween(x));
	}

}
