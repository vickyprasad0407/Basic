package com.enumbasic;

public class Test3 {

	public static void main(String[] args) {

		Beer[] b=Beer.values();
		for (Beer beer : b) {
			System.out.println(beer+"...."+beer.ordinal());
		}
		
		// if order is impt then use ordinal value.
		
	}

}
