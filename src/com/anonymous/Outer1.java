package com.anonymous;

public class Outer1 {

	static class Nested
	{
		public static void main(String[] args) {
			System.out.println("static nested class main method");
		}
	}
	public static void main(String[] args) {
       
		System.out.println("outer class main method");
	}

}
