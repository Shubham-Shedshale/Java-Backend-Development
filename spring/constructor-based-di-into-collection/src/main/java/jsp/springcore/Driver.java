package jsp.springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {
    	BeanFactory fact=new ClassPathXmlApplicationContext("myConfig.xml");
    	
//    	College c=fact.getBean("myCollege", College.class);
//    	System.out.println(c);
    	
    	Order o=fact.getBean("myOrder", Order.class);
    	System.out.println(o);
	}
}
