package com.jspiders.Abstraction;

public class Hotmainclass 
{
    public static void main(String[] args) 
    {
	    HotstarFree hf=new HotstarFree();
	       ContentManager.access(hf);
	    HotstarVip hv=new HotstarVip();
	      ContentManager.access(hv);
	    HotstarPremium hp=new HotstarPremium();
	      ContentManager.access(hp);
	       
    }
}
