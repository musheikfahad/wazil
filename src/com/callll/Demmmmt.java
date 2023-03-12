package com.callll;

import java.util.Calendar;

public class Demmmmt {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		System.out.println(cal);
		
		String[] dateArr = cal.getTime().toString().split(" ");
		
		for (String g : dateArr) {
			
			System.out.println(g);
			
		}
		
		
		cal.add(Calendar.DATE, 4);
		
		System.out.println(cal);	
	}

}
