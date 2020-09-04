package oopprogramms;

public class WorkerMain {

	public static void main(String[] args) {
		Employee obj1 = new Employee();
		Manager obj2=new Manager();
		System.out.println("  Employee data");
		obj1.enployeeinput();
		obj1.displaysalry();
		obj1.employeedisplay();
  
		System.out.println("\n   Manager data");
		obj2.managerinput();
		obj1.displaysalry();
		obj2.managerdisplay();


	}

}
