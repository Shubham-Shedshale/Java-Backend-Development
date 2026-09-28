package com.jspiders.constructors;

class Student
{
	Student()
	{
		System.out.println("Personal details");
		System.out.println("Academics details");
		
	}
	Student(boolean b)
	{
		System.out.println("Personal details");
		System.out.println("Academic details");
		System.out.println("Experience details");
	}
}

public class Mainclass6 
{
      public static void main(String[] args) {
		Student s1=new Student();
		System.out.println("----------------------");
		Student s2=new Student(true);
	}
}
