package com.internationalization;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo3 {

	public static void main(String[] args) {

		double d=123456.789;
		
		Locale india=new Locale("pa" , "IN");
		NumberFormat nf1=NumberFormat.getCurrencyInstance(india);
		System.out.println("India form is ...."+nf1.format(d));
		
		NumberFormat nf2=NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println("US specific form is ...."+nf2.format(d));
		
		NumberFormat nf3=NumberFormat.getCurrencyInstance(Locale.UK);
		System.out.println("UK specific form is ...."+nf3.format(d));
	}

}
