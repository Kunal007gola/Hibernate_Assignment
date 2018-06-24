package com.Kunal.Hibernate;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class DataAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory s= new Configuration().configure().addAnnotatedClass(Author.class).addAnnotatedClass(Book.class).buildSessionFactory();
		
		Session sass= s.openSession();
		sass.beginTransaction();
		
		Book bk=new Book();
		bk.setName("Let me");
		bk.setPrice((float) 2000.00);
		bk.setBid(7010);
		
		Author ar=new Author();
		ar.setAge(47);
		ar.setName("Zayn");
		ar.setId(101);
		ar.setBook(bk);
		
		
		sass.save(ar);
				
		
		sass.getTransaction().commit();
		sass.close();
		s.close();
		
	}

}
