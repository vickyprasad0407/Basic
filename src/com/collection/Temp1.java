package com.collection;

public class Temp1 {

	int i;
	public Temp1(int i) {
      this.i=i;
	}
	public int hashCode()
	{
		return i%9;
	}
	public String toString()
	{
		return i+" ";
	}

}
