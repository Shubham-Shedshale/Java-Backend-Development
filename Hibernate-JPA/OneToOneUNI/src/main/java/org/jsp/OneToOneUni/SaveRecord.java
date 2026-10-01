package org.jsp.OneToOneUni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveRecord {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("OneToOneUni");
	    EntityManager em=emf.createEntityManager();
	    
	    EntityTransaction etran=em.getTransaction();
	    
	    etran.begin();
	    Person p=new Person();
	    p.setName("Smith");
	    p.setPhone(223526277);
	    
	    Pancard card=new Pancard();
	    card.setPanno("SMITH123H");
	    card.setDob("11-2-2003");
	    
	    p.setCard(card);
	    em.persist(card);
	    em.persist(p);
	    etran.commit();
	    
	    
	    etran.begin();
	    Person p1=new Person();
	    p1.setName("John");
	    p1.setPhone(113526277);
	    
	    Pancard card1=new Pancard();
	    card1.setPanno("John223H");
	    card1.setDob("20-12-2003");
	    
	    p1.setCard(card1);
	    em.persist(card1);
	    em.persist(p1);
	    etran.commit();
	    
	    
	    etran.begin();
	    Person p2=new Person();
	    p2.setName("Scott");
	    p2.setPhone(214446277);
	    
	    Pancard card2=new Pancard();
	    card2.setPanno("SCOTT123H");
	    card2.setDob("10-3-2002");
	    
	    p2.setCard(card2);
	    em.persist(card2);
	    em.persist(p2);
	    etran.commit();
	}

}
