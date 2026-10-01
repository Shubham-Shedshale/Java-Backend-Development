package org.jsp.onetomanyormanytoonebi;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveRecords {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction etran=em.getTransaction();
		
		etran.begin();
		
		Merchant m1=new Merchant();
		m1.setName("Max");
		m1.setGstnum("M1234");
		m1.setEmail("max@gmail.com");
		m1.setPhone(8877665544l);
		m1.setPassword("max@123");
		
		Product p1=new Product();
		p1.setName("T-shirt");
		p1.setBrand("max");
		p1.setCategory("Garments");
		p1.setPrice(1499.0);
		p1.setM(m1);
		
		
		Product p2=new Product();
		p2.setName("Trousers");
		p2.setBrand("max");
		p2.setCategory("Clothes");
		p2.setPrice(1799.0);
		p2.setM(m1);
		
		Product p3=new Product();
		p3.setName("Shirt");
		p3.setBrand("max");
		p3.setCategory("Garments");
		p3.setPrice(999.0);
		p3.setM(m1);
		
		m1.setPlist(Arrays.asList(p1,p2,p3));
		
		em.persist(m1);
		
	etran.commit();
		
		
		
	}

}
