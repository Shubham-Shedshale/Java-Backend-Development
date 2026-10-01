package org.jsp.OneToOneUni;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindPancardByNumber {
	
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("OneToOneUni");
	    EntityManager em=emf.createEntityManager();
	    
	    Query q=em.createQuery("select card from Pancard card where card.panno=?1");
	    System.out.println("Enter the Pan number");
	    q.setParameter(1, new Scanner(System.in).next());
	    
	    Pancard p=(Pancard) q.getSingleResult();
	    
	    if(p!=null)
	    {
	    	System.out.println(p);
	    }
	    else
	    {
	    	System.out.println("No result found");
	    }
	}

}
