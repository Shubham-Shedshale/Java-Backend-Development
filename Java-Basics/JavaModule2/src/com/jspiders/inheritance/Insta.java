package com.jspiders.inheritance;

class InstagramOld
{
	void login()
	{
		System.out.println("Login to Instagram");
	}
	void post()
	{
		System.out.println("Posting in Instagram");

	}
}

class InstagramNew extends InstagramOld
{
	void story()
	{
		System.out.println("Posting stories");

	}
}
public class Insta {
	
	public static void main(String[] args)
	{
		InstagramNew IN=new InstagramNew();
		IN.login();
		IN.post();
		IN.story();
	}

}
