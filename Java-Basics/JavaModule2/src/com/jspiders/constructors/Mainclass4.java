package com.jspiders.constructors;

class Amazon
{
	Amazon()
	{
		System.out.println("Initiaize shopping");
	}
	Amazon(double subscription)
	{
		System.out.println("Initiaize shopping");
		System.out.println("Initiaize prime video");
		System.out.println("Initiaize amazon music");
	}
}

public class Mainclass4 
{
        public static void main(String[] args) {
			Amazon a1= new Amazon();
			System.out.println("--------------------");
			Amazon a2=new Amazon(1500);
			
		}
}
