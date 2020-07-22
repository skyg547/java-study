package practice01;

import java.util.Scanner;

public class Prob01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("숫자를 입력하세요");

		int i = scanner.nextInt();

		if (i % 3 == 0)
			System.out.println("3의배수입니다.");

		scanner.close();
	}
}
