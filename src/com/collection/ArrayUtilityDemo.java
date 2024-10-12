package com.collection;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayUtilityDemo {

	public static void main(String[] args) {

		String [] a= {"A","Z","B"};
		Comparator c=new MyComparator2();
		Arrays.sort(a,c);
		for(String a1:a)
		{
		System.out.print(a1+" ");
		}
	}

}
