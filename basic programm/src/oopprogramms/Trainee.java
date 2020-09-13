package oopprogramms;

public class Trainee extends Managers {

	Trainee (Long Id,String phone, String Name,String Addres,Double salary)
	 {
		 super(Id,phone,Name,Addres,salary);
		 
		 employeeId=Id;
			
		 employeePhone=phone;
		
		 employeeName=Name;
		
		 employeeAddress=Addres;
		 basicSalary=salary;
		 
	 }
	 
	 
	 void  calculateTransportAllowance()
	 {
		 
		 
		 Double  transportAllowance = 10/100*basicSalary;
		 System.out.println("The Transport allowance is "+transportAllowance);
		 
	 }
	 
	 
	 
	 void displaydetails()
	 {
		 System.out.println("The Trainee id is "+employeeId);
		   System.out.println("The Trainee phone  is "+employeePhone);
		   System.out.println("The Trainee name is"+employeeName);
		   System.out.println("The Traineer  address is" +employeeAddress);
		   System.out.println("the Trainee basic salary is "+basicSalary);
		 
		 
	 }

}
