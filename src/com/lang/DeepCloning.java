package com.lang;

public class DeepCloning {

	public static void main(String[] args)throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Cat c=new Cat(10);
		Doggie d1=new Doggie(c,20);
		System.out.println(d1.i+"....."+d1.c.j);
		Doggie d2=(Doggie)d1.clone();
        d2.i=200;
        d2.c.j=100;
        System.out.println(d1.i+"..........."+d1.c.j);
	}

}
