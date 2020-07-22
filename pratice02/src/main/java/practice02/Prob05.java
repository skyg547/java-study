package practice02;

import java.util.Random;

public class Prob05 {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		int minNumber = 1;
		int maxNumber = 100;
		
		int correctNumber = random.nextInt(maxNumber) + minNumber;
		System.out.println(correctNumber);
	}
}
