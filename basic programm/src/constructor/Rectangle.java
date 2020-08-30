package constructor;

public class Rectangle {
	
	 int length;
	 int breadth;
	
	
	public  Rectangle()
	{
		length=0;
		breadth=0;
		
		
	}
	
	public  Rectangle(int l, int b)
	{
		length=l;
		breadth=b;
		
		
	}
	
	public  Rectangle(int c)
	{
 		   
		length=c;
		breadth=c;
		
		
	}
	
	public  void areacal()
	{
		int area=length*breadth;
		System.out.println("the area is "+area);
		
	}
	

}
