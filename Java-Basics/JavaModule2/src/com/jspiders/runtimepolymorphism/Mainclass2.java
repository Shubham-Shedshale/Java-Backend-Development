package com.jspiders.runtimepolymorphism;

public class Mainclass2 {
	public static void main(String[] args)
	{
		FacebookMobile fm=new FacebookMobile();
		DisplayAdapter.displayContenet(fm);
		
		FacebookWebsite fw=new FacebookWebsite();
		DisplayAdapter.displayContenet(fw);

	}

}
