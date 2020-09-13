package abstractinterfaces;

import java.util.Scanner;

public class Bookmain {
	public static void main(String[] args) {
		
		String Bname,Aname;
		int price;
		Scanner scr =new Scanner(System.in);
		System.out.println("enter the book name ");
		Bname=scr.next();
		System.out.println("enter the book author  name ");
		Aname=scr.next();
		System.out.println("enter the book price ");
		price= scr.nextInt();
		
		Book obj1 =new Book(Bname,Aname,price);
		obj1.setBname("apptitude");
		obj1.setAname("R.S.Agarwal");
		obj1.setPrice(500);
		
		
	    
	       System.out.println("information  taken from set gate methods");
	       
	  	 System.out.println("book  name is "+obj1.getBname());
	  	 System.out.println("author name is  "+ obj1.getAname());
	  	 System.out.println("age is "+obj1.getPrice());
		
		
		
	}

}
