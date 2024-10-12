package com.fileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo2 {
	
		public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
       Dog d1=new Dog();
       Cat c1=new Cat();
       Rat r1=new Rat();
       FileOutputStream fos=new FileOutputStream("abc.src");
       ObjectOutputStream oos=new ObjectOutputStream(fos);
       oos.writeObject(d1);
       oos.writeObject(c1);
       oos.writeObject(r1);
       
       FileInputStream fis=new FileInputStream("abc.src");
       ObjectInputStream ois=new ObjectInputStream(fis);
       Object [] o=new Object [3];
       for (int i=0;i<3 ;i++)
       {
    	   o [i]=ois.readObject();
    	   if (o[i] instanceof Dog)
           {
             Dog d2=(Dog)o[i];
             System.out.println(d2.i+"..."+d2.j);
           }
           else if (o [i] instanceof Cat)
           {
        	   Cat c2=(Cat)o[i];
        	   System.out.println(c2.i+"..."+c2.j);
           }
           else if (o[i] instanceof Rat)
           {
        	   Rat r2=(Rat)o [i];
        	   System.out.println(r2.i+"..."+r2.j);
           }
       }
       
       
       /*Object o1=ois.readObject();

       if (o1 instanceof Dog)
       {
         Dog d2=(Dog)o1;
         System.out.println(d2.i+"..."+d2.j);
       }
       else if (o1 instanceof Cat)
       {
    	   Cat c2=(Cat)o1;
    	   System.out.println(c2.i+"..."+c2.j);
       }
       else if (o1 instanceof Rat)
       {
    	   Rat r2=(Rat)o1;
    	   System.out.println(r2.i+"..."+r2.j);
       }
       Object o2=ois.readObject();
       if (o2 instanceof Dog)
       {
         Dog d2=(Dog)o2;
         System.out.println(d2.i+"..."+d2.j);
       }
       else if (o2 instanceof Cat)
       {
    	   Cat c2=(Cat)o2;
    	   System.out.println(c2.i+"..."+c2.j);
       }
       else if (o2 instanceof Rat)
       {
    	   Rat r2=(Rat)o2;
    	   System.out.println(r2.i+"..."+r2.j);
       }
       Object o3=ois.readObject();
       if (o3 instanceof Dog)
       {
         Dog d2=(Dog)o3;
         System.out.println(d2.i+"..."+d2.j);
       }
       else if (o3 instanceof Cat)
       {
    	   Cat c2=(Cat)o3;
    	   System.out.println(c2.i+"..."+c2.j);
       }
       else if (o3 instanceof Rat)
       {
    	   Rat r2=(Rat)o3;
    	   System.out.println(r2.i+"..."+r2.j);
       }*/
       System.out.println("......");
	}

}
