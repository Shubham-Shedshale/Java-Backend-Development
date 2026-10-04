package jsp.springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {
    	BeanFactory fact=new ClassPathXmlApplicationContext("myConfig.xml");
    	
    	Restaurant res=fact.getBean("myRestaurant", Restaurant.class);
    	System.out.println(res);
	}
}
