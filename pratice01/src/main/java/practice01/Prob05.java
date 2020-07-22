package practice01;

public class Prob05 {

	public static void main(String[] args) {
		
		/* 코드를 작성합니다 */
		for (int i = 0; i < 100; i++) {
			String a = String.valueOf(i);
			if(a.contains("3") || a.contains("6") || a.contains("9")){
				
								
				System.out.print(a);
				if(a.contains("3")) {
					
					System.out.print("짝");
				}
				if(a.contains("6")) {
					
					System.out.print("짝");
				}
				if(a.contains("9")) {
				
					System.out.print("짝");
				}
				System.out.println();
				
			}
		}
	}
}
