package com.enumbasic;

public class Test2 {

	public static void main(String[] args) {

		Beer b=Beer.KF;
		switch(b)
		{
		case KF:
			System.out.println("It is the child brand");
			break;
		case KO:
			System.out.println("IT is too light");
			break;
		case RC:
			System.out.println("IT is funn");
			break;
		default:
			System.out.println("Other brand");
		}
	}

}
