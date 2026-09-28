package classtest;

interface Company
{
	abstract void work();
	abstract void approval();
}
class Developers implements Company
{
	@Override
	public void work()
	{
		System.out.println("Developer working");
	}
	@Override
	public void approval()
	{
		System.out.println("Cannot approve leave");
	}
}
class Manager implements Company
{
	@Override
	public void work()
	{
		System.out.println("Manager working");
	}
	@Override
	public void approval()
	{
		System.out.println("Can Approve leave");
	}
}

class ServiceProvider
{
	static void approve(Company c)
	{
		if(c!=null)
		{
			c.work();
			if(c instanceof Manager)
			{
				c.approval();
			}
		}
	}	
}

public class Employee
{
	public static void main(String[] args) {
		Developers d=new Developers();
		ServiceProvider.approve(d);
		
		Manager m=new Manager();
		ServiceProvider.approve(m);
	}
}
