package com.bit2020.chapter03;

public class TestArrayUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] a = {10,20,30};
		int[] b = {100,200,300};
		
		
		
		int[] c = ArrayUtil.concat(a,b);
		if(c.length == a.length + b.length && a[0] == c[0]) {
			
			System.out.println("OK");
		} else {
			
			System.out.println("No");
		}
	}

}
