package abstractinterfaces;

import java.util.Scanner;

public class AuthorMain {

	public static void main(String[] args) {
		 String authorName,place;
		     int age;;
        Scanner scr = new Scanner(System.in);
        
        System.out.println("enter the author name");
        authorName=scr.next();
        System.out.println("enter the author place");
        place=scr.next();
        System.out.println("enter the author age");
        age=scr.nextInt();
        
        Author obj1 =new Author(authorName,place,age);
       obj1.setAuthorName("Rahul");
       obj1.setPlace("pune");
       obj1.setAge(24);
       
       
       System.out.println("information taken set gate methods");
       
  	 System.out.println("author name is "+obj1.getAuthorName());
  	 System.out.println("palce is  "+ obj1.getPlace());
  	 System.out.println("age is "+obj1.getAge());
  	 	 
        
        
        
	}

}
