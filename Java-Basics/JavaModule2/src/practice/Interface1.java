package practice;

public interface Interface1
{
   static void play()
   {
	   System.out.println("hiii");
   }
   default void run()
   {
	   System.out.println("running");
   }
     //void test();
}

class Demo implements Interface1
{
	static void test()
	{
		System.out.println("Tetsing");
	}
	
}
