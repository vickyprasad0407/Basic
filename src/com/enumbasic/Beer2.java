package com.enumbasic;

public enum Beer2 {

	KF(70),KO(80),RC(90),FO;
	
	int price;
	
	Beer2(int price)
	{
		this.price=price;
	}
	
	Beer2()
	{
		this.price=65;
	}
	
	public int getPrice()
	{
		return price;
	}
	
}
