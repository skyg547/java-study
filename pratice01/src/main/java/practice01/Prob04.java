package practice01;

import java.util.Scanner;

public class Prob04 {

	public static void main(String[] args) {
		/* 코드를 작성합니다. */
		Scanner scanner = new Scanner(System.in);

		String a = "";

		System.out.println("문자열을 입력하세요 : ");
		a = scanner.next();

		for (int i = 0; i <= a.length(); i++) {

			System.out.println(a.substring(0, i));
		}

		scanner.close();
	}
}