package com.test.lamda;

public class RemoveEntryInListIf {

	static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
		int[] scores = new int[2];
		if (a0 > b0)
			scores[0] += 1;
		else if (a0 < b0)
			scores[1] += 1;
		if (a1 > b1)
			scores[0] += 1;
		else if (a1 < b1)
			scores[1] += 1;
		if (a2 > b2)
			scores[0] += 1;
		else if (a2 < b2)
			scores[1] += 1;
        
        return scores;
    }
	
    static int diagonalDifference(int[][] a) {
    	int diagonal1 = 0, diagonal2 = 0;
        for(int index = 0; index < a.length; index++) {
        	diagonal1 += a[index][index];
        	diagonal2 += a[index][2-index];
        }
        
        return Math.abs(diagonal1-diagonal2);
    }
    
    static void plusMinus(int[] arr) {
        int pos = 0, neg = 0, zero = 0;
        for(int number : arr) {
            if (number > 0) 
                ++pos;
            else if (number < 0)
                ++neg;
            else 
                ++zero;
        }
//        System.out.println(pos/arr.length + "\n" + neg + "\n" + zero);
    }
	
	public static void main(String[] args) {
		for(int x : solve(5,1,2,6,1,7)) {
			System.out.println(x);
		}
		
		System.out.println(10/2);
	}
}
