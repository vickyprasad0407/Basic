package com.lang;

public class Test2 implements Cloneable{

	int i=10;
	int j=20;
	public static void main (String[] args) throws CloneNotSupportedException{
		// TODO Auto-generated method stub
		Test2 t1=new Test2();
		Test2 t2=(Test2)t1.clone();
		t2.i=100;
		t2.j=200;
		System.out.println(t1.i+"....."+t1.j);

	}

}
