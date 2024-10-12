package com.collection;

public class Employee implements Comparable{
	String name;
	int id;
	
	public Employee(String name, int id)
	{
		this.name=name;
		this.id=id;
	}
	public int compareTo(Object obj)
	{
		int eid1=this.id;
		Employee e=(Employee)obj;
		int eid2=e.id;
		if(eid1<eid2)
			return -1;
		else if(eid1>eid2)
			return 1;
		else 
			return 0;
	}
	public String toString()
	{
		return "{ "+name+"--->"+id+" }";
	}
	

}
