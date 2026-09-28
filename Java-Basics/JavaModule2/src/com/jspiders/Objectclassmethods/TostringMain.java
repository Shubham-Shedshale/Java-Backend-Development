package com.jspiders.Objectclassmethods;
class Demo
{
	String name;
	int age;
	double bill;
	
	@Override
	public String toString()
	{
		return "CName:"+name+",Cage:"+age+",Cbill:"+bill ;
	}
}

public class TostringMain {
	public static void main(String[] args) {
		Demo d1=new Demo();
		d1.name="Shubham";
		d1.age=20;
		d1.bill=20000.0;
		
		Demo d2=new Demo();
		d2.name="Ram";
		d2.age=22;
		d2.bill=10000.0;
		
		Demo d3=new Demo();
		d3.name="Raj";
		d3.age=25;
		d3.bill=30000.0;
		
		 System.out.println(d1);
		 System.out.println(d2);
		 System.out.println(d3);



		//System.out.println(d1);
//		 System.out.println(d1.toString());
//		 System.out.println(d2.toString());
//		 System.out.println(d3.toString());


		 
	}
}
