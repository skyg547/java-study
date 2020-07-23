package com.bit2020.chapter04;

public class ObjectTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point p = new Point(1,2);
		
		System.out.println(p.getClass()); //reflection -> 객체의 정보, 설계도를 가져오는 것
		System.out.println(p.hashCode()); // reference value -> X , address -> X, address 기반의 해싱 값 -> O
		
		System.out.println(p);	
		System.out.println(p.toString()); // getclass() + "@" + hachcode() 16진수값
	}

}
