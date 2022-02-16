package com.mondee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class JpaMainLogic {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jbd-pu");
		EntityManager em = emf.createEntityManager();
		Student s = em.find(Student.class,1023);
		
		System.out.println(s.getId() +" "+s.getMarks()+" "+s.getName());
	}

}
