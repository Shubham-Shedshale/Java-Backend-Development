package jsp.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShapeApp {
	
	@Autowired
	Shape shape;
	public void display()
	{
		//shape.sides();
		System.out.println("Displaying the sides of the shape:");
		shape.sides();
	}
	

}
