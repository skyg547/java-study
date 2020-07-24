package com.bit2020.chapter04;

public class WrapperClassTest01 {
	public static void main(String[] args) {
		Integer i = new Integer(10);
		Character c = new Character('A');
		Boolean b = new Boolean(true);
		
		
		System.out.println(i);
		System.out.println(b);
		System.out.println(c);
		
		//Auto Boxing
		
		Integer j1 = 10;
		Integer j2 = 10;
		
		System.out.println(j1+j2);
		System.out.println(j1 == j2);
		
		//Auto UnBoxing
		//int j3 = j2.intValue();
		int j3 = j2;
		System.out.println(j3== 10);
		System.out.println(j3);
	}
}
