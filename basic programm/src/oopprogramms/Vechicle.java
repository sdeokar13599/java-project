package oopprogramms;

import java.util.Scanner;

public class Vechicle {
	String vechicleName,serviceStationname;
	int Modelno,price;
	Scanner scr = new Scanner(System.in);
	
	
	 void input()
	{
		 
	System.out.println("enter the  name:");
	vechicleName=scr.next();
	System.out.println("enter the model no:");
	Modelno=scr.nextInt();
	System.out.println("enter the  price:");
	price=scr.nextInt();
	System.out.println("enter the serviceStation  name:");
	serviceStationname=scr.next();
	
	

}
 void Display()
 {
	 input();
	 
	 System.out.println("The vechicle  name is: "+vechicleName);
	 System.out.println("The  vechicle model no is : "+Modelno);
	 System.out.println("The   vehicle price is : "+price);
	 System.out.println("The vehicle  service sataion name is : "+serviceStationname);
 }
	
	
}
