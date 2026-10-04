package jsp.springcore;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {

	@Value(value="Smith")
	String name;
	
	@Value("20")
	int age;
	
	@Value("8998785463")
	long contact;  

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", contact=" + contact + "]";
	}
	
	
}
