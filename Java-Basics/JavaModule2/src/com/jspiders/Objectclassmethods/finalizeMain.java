package com.jspiders.Objectclassmethods;


class Connection
{
	int s=10;
	@Override 
	protected void finalize() throws Throwable
	{
		System.out.println("Release Connection");
	}
	
}
public class finalizeMain {
	public static void main(String[] args) 
	{
		Connection con=new Connection();
		System.out.println(con.s);
		System.gc();
		System.out.println("----------------------------------------");
		con=null;
		Connection con2=new Connection();
		//System.out.println(con2.s);
		//con2=null;
		System.gc();
		
	}

}
