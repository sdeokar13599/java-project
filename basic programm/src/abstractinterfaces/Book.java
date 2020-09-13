package abstractinterfaces;

public class Book {
 private String Bname,Aname;
private int price;

Book(String Bname,String Aname,int price )
{
	
	this.Bname=Bname;
	this.Aname=Aname;
	this.price=price;
	
	System.out.println("user entered information ");
	System.out.println("book name is "+this.Bname );
	System.out.println("book book author name  is "+this.Aname );
	System.out.println("book  price is "+this.price);
	
}

public String getBname() {
	return Bname;
}

public void setBname(String bname) {
	Bname = bname;
}

public String getAname() {
	return Aname;
}

public void setAname(String aname) {
	Aname = aname;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

}
