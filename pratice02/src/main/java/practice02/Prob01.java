package practice02;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		/* 코드�? ?��?��?��?��?��. */
		Scanner input = new Scanner(System.in);
		
		System.out.print("금액 :");
		
		int price = input.nextInt();

		System.out.println("50000원 :"+ price/50000 + "개");
		System.out.println("10000원 :"+ (price%50000)/10000 + "개");
		System.out.println("5000원 :"+ (price%10000)/5000 + "개");
		System.out.println("1000원 :"+ (price%5000)/1000 + "개");
		System.out.println("500원 :"+ (price%1000)/500 + "개");
		System.out.println("100원 :"+ (price%500)/100 + "개");
		System.out.println("50원 :"+ (price%100)/50 + "개");
		System.out.println("10원 :"+ (price%50)/10 + "개");
		System.out.println("5원 :"+ (price%10)/5 + "개");
		System.out.println("1원 :"+ (price%5)/1 + "개");
		
	}
}
