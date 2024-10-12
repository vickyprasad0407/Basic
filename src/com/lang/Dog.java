package com.lang;

public class Dog implements Cloneable {

	Cat c;
	int i;
	public Dog(Cat c,int i) {
		// TODO Auto-generated constructor stub
		this.c=c;
		this.i=i;
	}
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}

}
