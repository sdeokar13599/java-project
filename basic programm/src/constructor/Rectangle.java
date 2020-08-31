package constructor;

public class Rectangle {
	
	 int length;
	 int breadth;
	
	
	public  Rectangle()
	{
		length=0;
		breadth=0;
		
		
	}
	
	public  Rectangle(int length, int breadth)
	{
		this.length=length;
		this.breadth=breadth;
		
		
	}
	
	public  Rectangle(int num)
	{
 		   
		length=num;
		breadth=num;
		
		
	}
	
	public  void areacal()
	{
		int area=length*breadth;
		System.out.println("the area is "+area);
		
	}
	

}
