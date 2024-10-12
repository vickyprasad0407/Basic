package com.lang;

public class ShallowCloning {

	public static void main(String[] args)throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Cat c=new Cat(20);
		Dog d=new Dog(c,10);
		System.out.println(d.i+"........."+d.c.j);
        Dog d2=(Dog)d.clone();
        d2.i=100;
        d2.c.j=200;
        System.out.println(d.i+"........"+d.c.j);
	}

}
