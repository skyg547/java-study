package com.bit2020.chapter04.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream("./dooly.jpg");

			int data = -1;
			data = is.read();
			os = new FileOutputStream("./dooly3.jpg");
		} catch (FileNotFoundException e) {

			System.out.println("파일이 없습니다." + e);
		} catch (IOException e) {

			System.out.println("에러 : " + e);
		} finally {
			try {
				if (is != null) {

					is.close();
				}
				if (os != null) {

					os.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
