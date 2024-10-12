package com.enumbasic;

public enum Colour2 {

Red , Blue{
	public void info()
	{
		System.out.println("Dangerous Colour");
	}
}

, Green;
	
	public void info()
	{
		System.out.println("Universal Colour");
	}
}
