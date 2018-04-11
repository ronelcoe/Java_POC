package com.java.test;

public class Staircase {
	static void staircase(int n) {
        int spaceCounter = n-1;
        for(int outerIndex = 0; outerIndex < n; outerIndex++) {
            for(int innerIndex = 0; innerIndex < n; innerIndex++) {
                if(innerIndex < spaceCounter)
                    System.out.print(" ");
                else    
                    System.out.print("#");
            }
            System.out.println("");
            --spaceCounter;
        }
    }
	public static void main(String[] args) {
		staircase(6);
	}

}
