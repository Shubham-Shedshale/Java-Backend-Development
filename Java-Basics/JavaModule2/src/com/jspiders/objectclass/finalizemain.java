package com.jspiders.objectclass;

class Connection
{
	@Override
	protected void finalize() throws Throwable{
		System.out.println("Release connection");
		}
}

public class finalizemain {
	public static void main(String[] args) {
		Connection con=new Connection();
		System.gc();
		
		con=null;
		System.out.println("-------------------");
		System.gc();
	}

}
