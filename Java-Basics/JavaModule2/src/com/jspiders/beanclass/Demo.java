package com.jspiders.beanclass;

public class Demo {

	private Demo() {
		
	}
	
	private static Demo d=null;
	public static Demo getDemo()
	{
		if(d==null)
		{
			d=new Demo();
		}
		return d;
	}
}
