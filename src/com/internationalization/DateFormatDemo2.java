package com.internationalization;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo2 {

	public static void main(String[] args) {

		DateFormat us=DateFormat.getDateInstance(0,Locale.US);
		DateFormat uk=DateFormat.getDateInstance(0,Locale.UK);
		DateFormat italy=DateFormat.getDateInstance(0,Locale.ITALY);
		System.out.println("UK style is ...."+us.format(new Date()));
		System.out.println("US style is ...."+uk.format(new Date()));
		System.out.println("italy style is ....."+italy.format(new Date()));
		
		// for both date and time format we can display
		
		System.out.println("date and time for in italy style  "+DateFormat.getDateTimeInstance(0,0,Locale.ITALIAN).format(new Date()));
	}

}