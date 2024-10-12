package com.lang;

final public class MyImmutable {

	private int i;
	MyImmutable(int i)
	{
		this.i=i;
	}
	public MyImmutable modify(int i)
	{
		if (this.i==i)
			return this;
		else
			return (new MyImmutable(i));
	}
}
