package com.anonymous;

public class Test {

	public static void main(String[] args) {
		PopCorn p=new PopCorn ()
				{
			       public void taste()
			       {
			    	   System.out.println("spicy");
			       }
				};
				p.taste();
		PopCorn p1=new PopCorn ();
		p1.taste();
		PopCorn p2=new PopCorn()
				{
			       public void taste()
			       {
			    	   System.out.println("sweet");
			       }
				};
				p2.taste();

	}

}
