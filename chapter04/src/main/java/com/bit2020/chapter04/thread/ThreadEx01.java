package com.bit2020.chapter04.thread;

import java.util.ArrayList;
import java.util.List;

public class ThreadEx01 {
	public static void main(String[] args) {

		List<Object> list = new ArrayList<>();

		Thread t2 = new AlphabetThread(list);
		Thread t3 = new DigitThread(list);
		
		t2.start();
		t3.start();
		
		
		
	}
}
