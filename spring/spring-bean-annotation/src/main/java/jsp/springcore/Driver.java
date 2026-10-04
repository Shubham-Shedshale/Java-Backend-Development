package jsp.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
		
		Object o=context.getBean("obj", Object.class);
		System.out.println(o);
		
		Student s=context.getBean("getStudent", Student.class);
		System.out.println(s);
		
		Student s1=context.getBean("student", Student.class);
		System.out.println(s1);
		
		Student s2=context.getBean("getStudent", Student.class);
		System.out.println(s2);
		
		}

}
