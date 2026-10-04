package jsp.springcore;

//import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
		
		Person p=context.getBean("person", Person.class);
		System.out.println(p);
		
		Student s=context.getBean("student", Student.class);
		System.out.println(s);
	}

}
