package com.bit2020.paint;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 100;
		int y = 200;
		
		Point point1 = new Point();
		point1.setX(x);
		point1.setY(y);
		
		drawPoint(point1);
	}

	public static void drawPoint(Point pt) {
		
		pt.show();
	}
}
