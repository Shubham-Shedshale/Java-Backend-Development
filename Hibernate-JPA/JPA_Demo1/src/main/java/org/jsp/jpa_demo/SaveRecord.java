package org.jsp.jpa_demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveRecord {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		
		EntityManager em=emf.createEntityManager();
		EntityTransaction etran=em.getTransaction();
		
		etran.begin();
		Merchant m=new Merchant();
		m.setName("Zudio");
		m.setEmail("zudio@email.com");
		m.setGst_num("Zudio123");
		m.setPassword("zudio");
		m.setPhone(1233456666);
		em.persist(m);
		etran.commit();
		
		etran.begin();
		Merchant m1=new Merchant();
		m1.setName("Gucci");
		m1.setEmail("gucci@email.com");
		m1.setGst_num("Gucci123");
		m1.setPassword("gucci");
		m1.setPhone(1233333666);
		em.persist(m1);
		etran.commit();
		
		etran.begin();
		Merchant m2=new Merchant();
		m2.setName("Puma");
		m2.setEmail("ouma@email.com");
		m2.setGst_num("puma123");
		m2.setPassword("puma");
		m2.setPhone(1244553666);
		em.persist(m2);
		etran.commit();
	
	}

}
