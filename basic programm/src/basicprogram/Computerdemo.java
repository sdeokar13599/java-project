package basicprogram;

public class Computerdemo {

	public void input()
	{
		System.out.println("take the input from user");
	}
	
	public void output()
	{
		System.out.println("displayig the result");
	}
	public static void main(String[] args) {
		System.out.println("hi from main");
		
		Computerdemo object1=new Computerdemo();
		object1.input();
		object1.output();

	}

}
