package com.internationalization;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo {

	public static void main(String[] args) {

		System.out.println("Fullform is ......"+DateFormat.getDateInstance(0, Locale.US).format(new Date()));
		System.out.println("Medium format is ......"+DateFormat.getDateInstance(2,Locale.US).format(new Date()));
		System.out.println("Long format is ....."+DateFormat.getDateInstance(1,Locale.US).format(new Date()));
		System.out.println("Short format is ....."+DateFormat.getDateInstance(3, Locale.US).format(new Date()));
	}

}
