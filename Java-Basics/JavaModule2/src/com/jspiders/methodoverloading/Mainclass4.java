package com.jspiders.methodoverloading;

class Facebook
{
	void login(String un,String pass)
	{
		System.out.println("Login with username and pass");

	}
	
	void login(long ph,String pass)
	{
		System.out.println("Login with ph num and pass");

	}
}

public class Mainclass4 {
	public static void main(String[] args) {
		Facebook f=new Facebook();
		f.login("abc","tiger");
		f.login(746453535,"tiger");
	}

}
