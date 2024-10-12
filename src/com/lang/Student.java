package com.lang;

public class Student {
	String name;
	int rollno;
	Student (String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}
	public boolean equals(Object obj)
	{
		if (obj==this)
			return true;
		if (obj instanceof Student)
		{
		try {
			
			Student s=(Student)obj;
			if (name.equals(s.name) && rollno==rollno)
			{
				return true;
			}
			else
				return false;
		}
		catch(ClassCastException e) {return false;}
		catch(NullPointerException e) {return false;}
		}
		return false;
	}
	public static void main(String[] args) {

		Student s1=new Student("vicky",101);
		Student s2=new Student("ravi",102);
		Student s3=new Student("vicky",101);
		Student s4=s1;
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(null));
	}

}
