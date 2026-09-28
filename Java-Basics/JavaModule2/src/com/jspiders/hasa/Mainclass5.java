package com.jspiders.hasa;

class Department
{
	void teach()
	{
		System.out.println("Teachers teach");

	}
}

class Student
{
	void learn()
	{
		System.out.println("Students Learn");

	}
}

class College
{
	Department d=new Department();
	Student s;
	
	College(Student s)
	{
		this.s=s;
	}
}


public class Mainclass5 
{
    public static void main(String[] args) {
		Student s=new Student();
		College c=new College(s);
		c.s.learn();
		c.d.teach();
	}
}
