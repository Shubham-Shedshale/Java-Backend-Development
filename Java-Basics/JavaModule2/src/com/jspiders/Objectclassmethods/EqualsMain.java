package com.jspiders.Objectclassmethods;
class Sample
{
	private int pid=101;
	private int pid2=102;
	@Override
	public boolean equals(Object obj)
	{
		Sample s=(Sample)obj;
		if(this.pid2==s.pid2)
		{
			return true;
		}
		else
		{        
			return false;
		}
	}
}
public class EqualsMain 
{
	private int pid=101;	
    public static void main(String[] args) {
    Sample s1=new Sample();
    Sample s2=new Sample();
    System.out.println(s1.equals(s2));
    
    //System.out.println(s1.pid==s2.pid);
}
}
