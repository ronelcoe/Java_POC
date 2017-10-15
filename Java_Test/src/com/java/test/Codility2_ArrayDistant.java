package com.java.test;

public class Codility2_ArrayDistant {

	public static void main(String[] args) {
//		int[] a = {8, 24,3, 20, 1, 17};
		int[] a = {7, 21,3,42,3,7};
		int minimumDistance = Math.abs(a[0] - a[1]), outerIndex = 0, innerIndex = 0;
		for (;outerIndex < a.length; outerIndex++, innerIndex=outerIndex) 
			while(++innerIndex < a.length) {
				int tmpDistance = Math.abs(a[outerIndex] - a[innerIndex]);
				minimumDistance = tmpDistance < minimumDistance ? tmpDistance : minimumDistance;
			}
		System.out.println(minimumDistance);
	}

}
