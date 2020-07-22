package prob2;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Goods[] goods = new Goods[COUNT_GOODS];
		
		for (int i = 0; i < COUNT_GOODS; i++) {

			String line = scanner.nextLine();
			String[] token = line.split(" ");
			
			String name = token[0];
			int price = Integer.parseInt(token[1]);
			int stock = Integer.parseInt(token[2]);
			
			System.out.println(name + " " + price + " " + stock);
		}


		scanner.close();
	}
}
