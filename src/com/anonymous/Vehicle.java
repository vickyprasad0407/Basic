package com.anonymous;

public interface Vehicle {

	public int getNoOfWheel();
	class DefaultVehicle implements Vehicle
	{
		public int getNoOfWheel()
		{
			return 2;
		}
	}
}
