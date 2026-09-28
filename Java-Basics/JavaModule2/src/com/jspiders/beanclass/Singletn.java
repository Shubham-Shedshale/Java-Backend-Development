package com.jspiders.beanclass;

public class Singletn {
	
	public static void main(String[] args) {
		Demo d1=Demo.getDemo();
		Demo d2=Demo.getDemo();
		Demo d3=Demo.getDemo();
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);


		
	}

}
