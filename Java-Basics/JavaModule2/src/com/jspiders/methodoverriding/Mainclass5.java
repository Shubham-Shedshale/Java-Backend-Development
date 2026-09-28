package com.jspiders.methodoverriding;


class FacebookOld
{
	void reaction()
	{
		System.out.println("Like");
	}
}

class FacebookNew extends FacebookOld
{
	void reaction()
	{
		System.out.println("Like,Sad,angry,love,haha");

	}
}
public class Mainclass5 
{
  public static void main(String[] args) {
	FacebookOld fo=new FacebookOld();
	fo.reaction();
	
	FacebookNew fn=new FacebookNew();
	fn.reaction();
	
	FacebookOld ref=new FacebookNew();
	ref.reaction();
}

}
