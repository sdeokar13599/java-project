package oopprogramms;

public class Managers extends Employees {
	
	
	 Managers(Long Id,String phone, String Name,String Addres,Double salary)
	 {
		 super(Id,phone,Name,Addres);
		 
		 employeeId=Id;
			
		 employeePhone=phone;
		
		 employeeName=Name;
		
		 employeeAddress=Addres;
		 basicSalary=salary;
		 
	 }
	 
	 
	 void  calculateTransportAllowance()
	 {
		 
		 
		 Double  transportAllowance = 15/100*basicSalary;
		 System.out.println("The Transport allowance is "+transportAllowance);
		 
	 }
	 
	 void Displaydeatails()
	 {
		 
		 
		 System.out.println("The Manager id is "+employeeId);
		   System.out.println("The Manger phone  is "+employeePhone);
		   System.out.println("The  Manager name is"+employeeName);
		   System.out.println("The  Manager  address is" +employeeAddress);
		   System.out.println("the Managers basic salary is "+basicSalary);
	 }

}
