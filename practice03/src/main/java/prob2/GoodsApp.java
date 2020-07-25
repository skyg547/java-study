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
			
			goods[i] = new Goods(name, price, stock);
			
		}

		for (int i = 0; i < COUNT_GOODS; i++) {
			
			System.out.println(goods[i].getGoods()+ "(가격:" + goods[i].getGoddsPrice() + "원)이  " + goods[i].getGoodsMount()+"개 입고 되었습니다.");
		}

		scanner.close();
	}
}
