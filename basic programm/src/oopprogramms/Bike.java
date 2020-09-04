package oopprogramms;

import java.util.Scanner;

public class Bike extends Vechicle {
int discountrate;
Scanner scr =new Scanner(System.in);

void Bikedisplay()
{

	System.out.println("Bike");
	input();
	 System.out.println("The bike name is: "+vechicleName);
	 System.out.println("The  bike model no is : "+Modelno);
	 System.out.println("The bike  price is : "+price);
	 System.out.println("The bike  service sataion name is : "+serviceStationname);
	
	
	
}

 
 void discount()
 {
	 System.out.println("enter the discount rate ");
	 int discountrate=scr.nextInt();
	int discount=  price-(price*discountrate/100);
	System.out.println("the discount price is:"+discount);
	 
	 
 }
	 




	
	

	
	
}
