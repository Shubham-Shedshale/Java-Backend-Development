package jsp.springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		BeanFactory factory=new ClassPathXmlApplicationContext("myConfig.xml");
		
		Person p1=(Person)factory.getBean("myPerson");
		System.out.println(p1);
		
		Person p2=factory.getBean("myPerson", Person.class);
		System.out.println(p2);
		
		Employee e1=factory.getBean("myEmployee", Employee.class);
		System.out.println(e1);
		
	}

}
