package practice01;

import java.util.Scanner;

public class Prob03 {

	public static void main(String[] args) {

		/* 코드를 작성합니다. */
		Scanner scanner = new Scanner(System.in);

		System.out.println("숫자를 입력하세요");

		int i = scanner.nextInt();
		int sum = 0;

		if (i % 2 == 0) {

			for (int j = 0; j <= i; j++) {
				if (j % 2 == 0)
					sum = sum + j;
			}

		} else {

			for (int j = 0; j <= i; j++) {

				if (j % 2 != 0)
					sum = sum + j;
			}

		}

		System.out.println(sum);

		scanner.close();
	}

}
