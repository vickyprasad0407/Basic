package com.enumbasic;

public class Test5 {

	public static void main(String[] args) {

		Beer2[] b= Beer2.values();
		
		for(Beer2 b1: b)
		{
			System.out.println(b1+"........"+b1.getPrice());
		}
	}

}
