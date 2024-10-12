package com.internationalization;

import java.text.NumberFormat;

public class NumberFormatDemo4 {

	public static void main(String[] args) {

		NumberFormat nf=NumberFormat.getInstance();
		nf.setMaximumFractionDigits(2);
		System.out.println(nf.format(123.4567));
		System.out.println(nf.format(123.4));
		
		NumberFormat nf2=NumberFormat.getInstance();
		nf2.setMinimumFractionDigits(2);
		System.out.println(nf2.format(123.4567));
		System.out.println(nf2.format(123.4));
		
		NumberFormat nf3=NumberFormat.getInstance();
	    nf3.setMaximumIntegerDigits(3);
	    System.out.println(nf3.format(123456.789));
	    System.out.println(nf3.format(123.456));
	    System.out.println(nf3.format(1.234));
	    
	    NumberFormat nf4=NumberFormat.getInstance();
	    nf4.setMinimumIntegerDigits(3);
	    System.out.println(nf4.format(123456.789));
	    System.out.println(nf4.format(1.2345));
	}

}
