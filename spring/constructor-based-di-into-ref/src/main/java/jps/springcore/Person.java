package jps.springcore;

public class Person {
	
	Mobile mobile;
	
	Person(Mobile mobile)
	{
		this.mobile=mobile;
	}
	
	public void use()
	{
		mobile.ring();
		System.out.println("Person is using mobile");
	}

}
