package practice02;

import javax.swing.RepaintManager;

public class Prob03 {
	public static void main(String args[]) {
		char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l', '.' };

		// ?��?�� 배열 ?��?�� 출력
		printCharArray(c);

		// 공백 문자 바꾸�?
		replaceSpace(c);

		// ?��?��?�� 배열 ?��?�� 출력
		printCharArray(c);
	}
	
	public static void replaceSpace( char[] c ) {
		/* 코드�? ?��?��?��?��?��. */
		for (int i = 0; i < c.length; i++) {

			if(c[i] == ' ') {
				c[i] = ',';
			}
		}
		
	}
	
	public static void printCharArray( char[] c ) {
		/* 코드�? ?��?��?��?��?��. */
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}
		System.out.println();
	}
}
