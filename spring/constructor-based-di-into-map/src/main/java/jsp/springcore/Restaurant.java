package jsp.springcore;

import java.util.Map;

public class Restaurant {
	
	String name;
	String location;
	double rating;
	
	private Map<Integer,String> menu;
	
	Restaurant(String name,String location,double rating,Map<Integer,String> menu)
	{
		this.name=name;
		this.location=location;
		this.rating=rating;
		this.menu=menu;
	}

	@Override
	public String toString() {
		return "Restaurant [name=" + name + ", location=" + location + ", rating=" + rating + ", menu=" + menu + "]";
	}
	
	

}
