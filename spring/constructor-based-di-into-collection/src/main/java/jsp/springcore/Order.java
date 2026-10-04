package jsp.springcore;
import java.util.List;

public class Order {
	
	long orderId;
	double amount;
	List<String> products;
	
	Order(long orderId,double amount,List<String> products)
	{
		this.orderId=orderId;
		this.amount=amount;
		this.products=products;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", amount=" + amount + ", products=" + products + "]";
	}
	
	

}
