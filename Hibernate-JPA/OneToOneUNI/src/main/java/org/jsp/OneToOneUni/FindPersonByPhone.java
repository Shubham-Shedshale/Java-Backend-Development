package org.jsp.OneToOneUni;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindPersonByPhone {
	
public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("OneToOneUni");
	    EntityManager em=emf.createEntityManager();
	    
	    Query q=em.createQuery("select p from Person p where p.phone=?1");
	    System.out.println("Enter the phone");
	    q.setParameter(1, new Scanner(System.in).nextLong());
	    
	    List<Person> li=q.getResultList();
	   
	    if(li.isEmpty())
	    {
	    	System.out.println("Result not found");
	    }
	    else
	    {
	    	for(Person p:li)
	    	{
	    	   System.out.println(p);
	    	}
	    }
	  
    }

}
