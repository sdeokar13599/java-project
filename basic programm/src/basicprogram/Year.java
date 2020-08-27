package basicprogram;

public class Year {

	public static void main(String[] args) {
	 int days=373,year,week;
	 year=days/365;
	 week=days%365/7;
	 days=days%365%7;
			 
	 
	 
	 System.out.println("the year is:"+year );
	 System.out.println("the week is:"+week );
	 System.out.println("the days:"+days );
	 
	 

	}

}
