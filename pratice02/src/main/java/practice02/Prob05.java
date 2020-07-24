package practice02;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Random random = new Random();

		int minNumber = 1;
		int maxNumber = 100;
		boolean regame = true;
		int result, tryNum = 0;
		int correctNumber = random.nextInt(maxNumber) + minNumber;
		System.out.println("수를 결정하였습니다. 맞추어 보세요");

		while (regame) {
			tryNum++;
			System.out.println(minNumber + " - " + maxNumber);
			System.out.print(tryNum + ">>");
			result = input.nextInt();

			if (result == correctNumber) {
				System.out.println("맞았습니다. 다시하겠슨니까?(y/n)");

				String answer = input.next();

				if (answer.equals("n")) {
					// 종료하도록 작성한다.
					regame = false;
				} else {
					minNumber = 1;
					maxNumber = 100;
					regame = true;
					result = 0;
					tryNum = 0;
					correctNumber = random.nextInt(maxNumber) + minNumber;
					System.out.println("수를 결정하였습니다. 맞추어 보세요");
				}

			} else if (result > correctNumber) {
				System.out.println("더낮게");
				maxNumber = result;
			} else if (result < correctNumber) {
				System.out.println("더높게");
				minNumber = result;
			}

		}
	}
}
