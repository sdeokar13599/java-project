package abstractinterfaces;

public class Author {
    private String authorName,place;
    private int age;
     Author(String authorName, String place,int age)
     {
    	 this.authorName =authorName;
    	 this.place=place;
    	 this.age=age;
    	 
    	 System.out.println("information taken from user");
    	 System.out.println("author name is "+this.authorName);
    	 System.out.println("palce is"+this.place);
    	 System.out.println("age is "+this.age);
    	 	 
     }
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
     
     
    
    
}
