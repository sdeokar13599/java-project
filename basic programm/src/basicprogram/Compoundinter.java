package basicprogram;

public class Compoundinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p=2000,n=12,t=5;
		double r=0.08;
		double ci=p*Math.pow(1+(r/n),n*t)-p;
		
		
		System.out.println("the compound imterest is $"+ci);
		

	}

}
