package com.enumbasic;

public class Test7 {

	public static void main(String[] args) {
		// Over riding example.
		Colour2 [] c=Colour2.values();
		for (Colour2 c1 : c) {
                c1.info();
		}

	}

}
