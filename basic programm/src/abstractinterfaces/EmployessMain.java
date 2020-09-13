package abstractinterfaces;

import java.util.Scanner;

public class EmployessMain {
	
	public static void main(String[] args) {
	 Employess emp1 = new Employess();
     emp1.setName("Rahul");
     
     emp1.setEmpid(1);
     
     System.out.println("Employee name is : "+emp1.getName());
     System.out.println("Employee id is : "+emp1.getEmpid());


}
}
