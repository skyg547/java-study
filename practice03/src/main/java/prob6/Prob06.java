package prob6;

import java.util.Scanner;

public class Prob06 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while( true ) {
		
			/*  코드를 완성 합니다 */
			
			String input=  scanner.nextLine();
			String[] str =input.split(" ");
			
			
			int a = Integer.parseInt(str[0]);
			String cal = str[1];
			int b = Integer.parseInt(str[2]);
			
			if(input == "quit") {
				scanner.close();
				return;
			}
			
			Cal Cal = null;
			
			if (cal.equals("-")) {
				Cal = new Sub();
			} else if (cal.equals("*")) {
				Cal = new Mul();				
			} else if (cal.equals("/")) {
				Cal = new Div();				
			} else if (cal.equals("+")) {
				Cal = new Add();
			}
			
			Cal.setA(a);
			Cal.setB(b);
			Cal.calculate();		

			
		}
		
	}

}
