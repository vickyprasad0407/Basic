package com.lang;

public class Doggie implements Cloneable {

	Cat c;
	int i;
	public Doggie(Cat c,int i) {
		// TODO Auto-generated constructor stub
		this.c=c;
		this.i=i;
	}
	public Object clone() throws CloneNotSupportedException
	{
		Cat c1=new Cat(c.j);
		Doggie d=new Doggie(c1,i);
		return d;
	}

}
