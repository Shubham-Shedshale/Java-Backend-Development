package org.jsp.manytooneuni;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveRecords {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ManyToOneUni");
		EntityManager em=emf.createEntityManager();
		EntityTransaction etran=em.getTransaction();
		
		etran.begin();
		
		QuestionData qd=new QuestionData();
		qd.setQuestion("What is the most important thing in your life");
		qd.setQuestionedBy("Mayank");
		
		AnswerData a1=new AnswerData();
		a1.setAnswer("Money");
		a1.setAnsweredBy("Yuvraj");
		a1.setQd(qd);
		
		AnswerData a2=new AnswerData();
		a2.setAnswer("Cars");
		a2.setAnsweredBy("Rathore");
		a2.setQd(qd);
		
		AnswerData a3=new AnswerData();
		a3.setAnswer("Food");
		a3.setAnsweredBy("Sahana");
		a3.setQd(qd);
		
		AnswerData a4=new AnswerData();
		a4.setAnswer("Sleep");
		a4.setAnsweredBy("Aditya");
		a4.setQd(qd);
		
		AnswerData a5=new AnswerData();
		a5.setAnswer("Music");
		a5.setAnsweredBy("Ria");
		a5.setQd(qd);
		
		AnswerData a6=new AnswerData();
		a6.setAnswer("Peace");
		a6.setAnsweredBy("Venkat");
		a6.setQd(qd);
		
		
		List<AnswerData> al=Arrays.asList(a1,a2,a3,a4,a5,a6);
		
		for(AnswerData ad: al)
		{
			em.persist(ad);
		}
		
	etran.commit();
	}

}
