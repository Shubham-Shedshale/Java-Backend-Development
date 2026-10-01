package org.jsp.OneToOneUni;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindPersonByPanNumAndDob {
	
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("OneToOneUni");
	    EntityManager em=emf.createEntityManager();
	    
	    Query q=em.createQuery("select p from Person p where p.card.panno=?1 and p.card.dob=?2");
	    System.out.println("Enter the Pan Number");
	    q.setParameter(1, new Scanner(System.in).next());
	    
	    System.out.println("Enter the dob");
	    q.setParameter(2, new Scanner(System.in).next());
	   
	    Person p=(Person) q.getSingleResult();
	    
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
