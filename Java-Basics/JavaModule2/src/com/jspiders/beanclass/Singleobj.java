package com.jspiders.beanclass;

public class Singleobj 
{
  public static void main(String[] args) {
	Sample s1=Sample.getSample();
	Sample s2=Sample.getSample();
	Sample s3=Sample.getSample();
	
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);


	
}
}
