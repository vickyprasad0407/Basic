package com.lang;

import java.lang.reflect.Method;

public class Test1 {

	public static void main(String[] args) {

		int count=0;
		Object o=new String("vicky");
		Class c=o.getClass();
		System.out.println("fully qualified name of the class is "+c.getName());
		Method m[]=c.getDeclaredMethods();
		for (Method method : m) {
			System.out.println(method);
			count++;
		}
		System.out.println("the no of methods is"+count);
	}

}
