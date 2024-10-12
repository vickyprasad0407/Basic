package com.lang;

public class DriveMyImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyImmutable t1=new MyImmutable(10);
		MyImmutable t2=t1.modify(100);
		MyImmutable t3=t1.modify(10);
		System.out.println(t1==t2);
		System.out.println(t1==t3);

	}

}
