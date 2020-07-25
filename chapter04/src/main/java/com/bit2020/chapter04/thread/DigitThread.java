package com.bit2020.chapter04.thread;

import java.util.ArrayList;
import java.util.List;

public class DigitThread extends Thread {
	List<Object> list = new ArrayList<>();

	public DigitThread(List<Object> list) {
		this.list = list;

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
			
			synchronized(list){
				list.remove(new Object());
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
