package org.jsp.manytomaybi;

import java.lang.reflect.Array;
import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertRecord {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		
		EntityManager em=emf.createEntityManager();
		
		EntityTransaction etran=em.getTransaction();
		
		etran.begin();
		Student s1=new Student();
		s1.setName("A");
		s1.setMarks(78.8);
		s1.setPhone(6677884466l);
		
		Student s2=new Student();
		s2.setName("B");
		s2.setMarks(88.8);
		s2.setPhone(9988284466l);
		
		Student s3=new Student();
		s3.setName("C");
		s3.setMarks(80.1);
		s3.setPhone(8822886677l);
		
		Student s4=new Student();
		s4.setName("D");
		s4.setMarks(90.5);
		s4.setPhone(7100884466l);
		
		Student s5=new Student();
		s5.setName("E");
		s5.setMarks(79.8);
		s5.setPhone(9845823466l);
		
		Batch b1=new Batch();
		b1.setBatch_code("A15");
		b1.setSubject("Hibernate");
		b1.setTrainer("Mayank");
		
		Batch b2=new Batch();
		b2.setBatch_code("M13");
		b2.setSubject("Spring");
		b2.setTrainer("Anugraha");
		
		Batch b3=new Batch();
		b3.setBatch_code("E21");
		b3.setSubject("Core Java");
		b3.setTrainer("Aparna");
		
		s1.setBlist(Arrays.asList(b3));
		s2.setBlist(Arrays.asList(b1,b2,b3));
		s3.setBlist(Arrays.asList(b2,b3));
		s4.setBlist(Arrays.asList(b1,b2,b3));
		s5.setBlist(Arrays.asList(b2,b3));

	    b1.setSlist(Arrays.asList(s2,s4));
	    b2.setSlist(Arrays.asList(s2,s4,s3,s5));
	    b3.setSlist(Arrays.asList(s1,s2,s3,s4,s5));
		
	    em.persist(b1);
	    em.persist(b2);
	    em.persist(b3);
	    
	    etran.commit();
		
	}
}
