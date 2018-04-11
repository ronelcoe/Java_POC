package com.java.test;

public class Generics<T1, T2> {
	void compute(T1 t1, T2 t2) {
		if (t1 instanceof Integer && t2 instanceof Integer)
			System.out.println(Integer.valueOf(t1.toString()) + Integer.valueOf(t2.toString()));
		else
			System.out.println(t1.toString() + t2.toString());
	}

	public static void main(String[] args) {
		Generics a1 = new Generics();
		
		a1.compute(new Integer(4), new Integer(6));
		a1.compute("a", "b");
	}

}
