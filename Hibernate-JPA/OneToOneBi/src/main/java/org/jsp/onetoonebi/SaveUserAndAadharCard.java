package org.jsp.onetoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveUserAndAadharCard {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	    EntityManager em=emf.createEntityManager();
	    
	    EntityTransaction etran=em.getTransaction();
	    
	    etran.begin();
	    User u=new User();
	    u.setName("Smith");
	    u.setPhone(8877665544l);
	    
	    AadharCard card=new AadharCard();
	    card.setNumber(6677443322l);
	    card.setAddress("Bengaluru");
	    card.setU(u);
	    
	    u.setCard(card);
	    em.persist(u);
	    
	    
	    User u1=new User();
	    u1.setName("Rahul");
	    u1.setPhone(9966665544l);
	    
	    AadharCard card1=new AadharCard();
	    card1.setNumber(9898653466l);
	    card1.setAddress("Mysore");
	    card1.setU(u1);
	    
	    u1.setCard(card1);
	    em.persist(u1);
	    
	    
	    User u2=new User();
	    u2.setName("Aditya");
	    u2.setPhone(6667772544l);
	    
	    AadharCard card2=new AadharCard();
	    card2.setNumber(7865534626l);
	    card2.setAddress("Mysore");
	    card2.setU(u2);
	    
	    u2.setCard(card2);
	    em.persist(u2);
	    
	    etran.commit();
	    
	    
	}
}
