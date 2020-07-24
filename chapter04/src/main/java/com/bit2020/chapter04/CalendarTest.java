package com.bit2020.chapter04;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		printDate(cal);
		
		cal.set(Calendar.YEAR, 2021);
		cal.set(Calendar.MONTH, 11);
		cal.set(Calendar.DATE, 25);
		printDate(cal);
		
		cal.set(1996, 10, 04);
		cal.add(Calendar.DATE, 10000);
		printDate(cal);
		
	}
	
	public static void printDate(Calendar cal) {
		
		String[] days = {"일", "월" , "화" , "수", "목", "금" , "토" };
		
		//년도
		int year = cal.get(Calendar.YEAR);
		
		//월 (0~11 , +1)
		int month = cal.get(Calendar.MONTH);
		
		int date = cal.get(Calendar.DATE);

		int hour = cal.get(Calendar.HOUR);
		
		int minute = cal.get(Calendar.MINUTE);
		
		int second = cal.get(Calendar.SECOND);
		
		//요일 [1(일) ~ 7 (토)]
		int day = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(
				year + "년 " +
						(month+1) + "월 " +
						date + "일 " +
						hour + "시 " +
						minute + "분 " +
						second+ "초 "+
						days[day-1]		+ "요일"
				);
	}
}
