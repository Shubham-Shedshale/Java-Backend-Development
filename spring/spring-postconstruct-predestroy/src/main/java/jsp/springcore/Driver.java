package jsp.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
		        new AnnotationConfigApplicationContext(MyConfig.class);

		Car car = context.getBean(Car.class);

		car.drive();

		context.close();
		
		System.out.println(car);
		
	}

}
