package jsp.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Passenger {
	
	@Autowired
	Ticket ticket;
	
	public void travel()
	{
		ticket.bookTicket();
		System.out.println("Passenger is travelling");
	}
	
	

}
