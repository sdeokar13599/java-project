package constructor;

public class Bank {

	
	int amount =5000;
	
	
	public Bank()
	{
		
		amount=0;
		System.out.println("intial amount is:"+amount);
		
	}
	
	public Bank(int x)
	{
		
		amount=x;
		System.out.println(" the final amount is :"+x);
	}
	
}
