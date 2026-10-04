package jsp.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
		
		ShapeApp sa=context.getBean("shapeApp", ShapeApp.class);
		sa.display();
				
    //if we made both impl class then we get an exception NoUniqueBeanDifinitionException
	}

}
