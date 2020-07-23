package practice02;

public class Prob04 {
	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	public static char[] reverse(String str) {

		/* 코드�? ?��?��?��?��?�� */
		char[] result = null;
		for (int i = 0; i < str.length(); i++) {
			result = str.toCharArray();
		}
		
		for (int i = 0; i < result.length/2; i++) {
			char temp = result[i];
			result[i] = result[result.length - i];
			result[result.length - i] = temp;
		}
		return result; 
	}

	public static void printCharArray(char[] array){
		/* 코드�? ?��?��?��?��?�� */
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}
		System.out.println();
	}
}
