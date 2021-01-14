package com.bit2020.chapter03.exception;




public class MyClassTest {

	
	public static void main(String[] args) {
		
		
		try {
			MyClass myClass =new MyClass();
			myClass.danger();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
