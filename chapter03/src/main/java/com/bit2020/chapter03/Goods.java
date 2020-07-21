package com.bit2020.chapter03;

public class Goods {
	
	private int price;
	private int countSold;
	private int countStock;
	private String name;
	
	public static int countofGodds = 0;
	
	
	public Goods() {
		countofGodds = countofGodds + 1 ;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCountSold() {
		return countSold;
	}
	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
	public int getCountStock() {
		return countStock;
	}
	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void showInfo() {
		
		System.out.println(
				"상품이름 : " + name +
				", 가격 : " + price +
				", 재고개수 : " + countStock +
				", 팔린 갯수 : " + countSold
				);
		
	}
	
	public int calculateDiscountPrice(double percentage) {
				
		return (int)(price * percentage/100);
	}
	
}
