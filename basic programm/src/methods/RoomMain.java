package methods;

public class RoomMain {

	public static void main(String[] args) {
		Room obj1 =new Room();
		obj1.input();
          float area = obj1.whiteWashingArea();
          System.out.println("the white washing area is "+area);
          int cost=obj1.whiteWashingcost();
          System.out.println("the whitewashing cost is"+cost);
          int flooringcost=obj1.flooringcost();
          System.out.println("the flooring cost is" +flooringcost);
		
		

	}

}
