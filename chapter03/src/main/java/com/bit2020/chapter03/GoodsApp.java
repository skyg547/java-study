package com.bit2020.chapter03;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Goods camera = new Goods();
		
		camera.setCountSold(20);
		camera.setCountStock(30);
		camera.setName("Nikon");
		camera.setPrice(20000);
		
		System.out.println(camera);
		
		camera.showInfo();
		System.out.println(camera.calculateDiscountPrice(50));
		

	}

}
