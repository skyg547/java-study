package com.bit2020.chapter03.person;

public class Person {

		private String name;
		protected int height;
		public int weight;
		
		/*
		 * public Person() {
		 * 
		 * System.out.println("보무 호출"); }
		 */

		public Person(String name) {
			this.name = name; 
			System.out.println("보무 호출");
		}
}
