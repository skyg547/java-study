package com.bit2020.chapter04.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.io.BufferedReader br = null;

		try {

			// 기반 스트림
			FileReader fr = new FileReader("./src/main/java/com/bit2020/chapter04/io/BufferedReader.java");
			String line =null;
			int index = 0;
			while((line = br.readLine()) != null) {
				index++;
				System.out.print(index+ " : ");
				System.out.println(line);
			}
			// 보조 스트림
			br = new java.io.BufferedReader(fr);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
