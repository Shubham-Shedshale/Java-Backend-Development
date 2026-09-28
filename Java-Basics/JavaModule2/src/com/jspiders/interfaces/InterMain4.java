package com.jspiders.interfaces;

interface X
{
	void push();
}

interface Y extends X
{
	void send();
}

class Z implements Y
{
	@Override
	public void push()
	{
		System.out.println("push()....");

	}
	@Override
	public void send()
	{
		System.out.println("send()...");

	}
}

public class InterMain4 
{
   public static void main(String[] args) {
	Z ref=new Z();
	ref.push();
	ref.send();
}
}
