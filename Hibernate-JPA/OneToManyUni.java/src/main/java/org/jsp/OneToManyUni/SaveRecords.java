package org.jsp.OneToManyUni;

import java.time.Period;
import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.Transaction;

public class SaveRecords {
	
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("OneToManyUni");
		EntityManager em=emf.createEntityManager();
		EntityTransaction etran=em.getTransaction();
		
		etran.begin();
		Dept d1=new Dept();
		d1.setName("HR");
		d1.setLoc("BTM");
		
		Dept d2=new Dept();
		d2.setName("Accounts");
		d2.setLoc("HSR");
		
		Employee e1=new Employee();
		e1.setName("A");
		e1.setSalary(15000);
		e1.setExp(1.2);
		
		Employee e2=new Employee();
		e2.setName("B");
		e2.setSalary(16000);
		e2.setExp(1.5);
		
		Employee e3=new Employee();
		e3.setName("C");
		e3.setSalary(19000);
		e3.setExp(1.7);
		
		Employee e4=new Employee();
		e4.setName("D");
		e4.setSalary(21000);
		e4.setExp(1.7);
		
		Employee e5=new Employee();
		e5.setName("E");
		e5.setSalary(25000);
		e5.setExp(1.9);
		
		d1.setElist(Arrays.asList(e2,e4));
		d2.setElist(Arrays.asList(e1,e3,e5));
		
		em.persist(d1);
		em.persist(d2);
		
	etran.commit();

		
		
		
	}

}
