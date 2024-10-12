package com.collection;

public class Temp {

	public String toString()
	{
		return "temp";
	}
	public void finalize()
	{
		System.out.println("Finalized method call");
	}
}
