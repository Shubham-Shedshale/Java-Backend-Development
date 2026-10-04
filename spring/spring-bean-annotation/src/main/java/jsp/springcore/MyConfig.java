package jsp.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="jsp.springcore")

public class MyConfig {
	
	@Bean(name="obj")
	public Object getObject()
	{
		return new Object();
	}
	
	@Bean
	public Student getStudent()
	{
		return new Student();
	}

}
