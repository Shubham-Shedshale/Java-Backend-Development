package classtest;

class Recharge 
{
  void recharge()
  {
	  System.out.println("Basic recahrge");
  }
}

class CashbackRecharge extends Recharge
{
	@Override
	void recharge()
	{
		  System.out.println("Recharge with cashback");

	}
}

class ValidityRecharge extends Recharge
{
	@Override
	void recharge()
	{
		  System.out.println("Recharge with validity");

	}
}

public class Mobile
{
	public static void main(String[] args) {
		Recharge r;
		r=new Recharge();
		r.recharge();
		
		r=new CashbackRecharge();
		r.recharge();
		
		r=new ValidityRecharge();
		r.recharge();
	}
}