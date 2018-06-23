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
		
		Author ar1=new Author();
		ar1.setAge(47);
		ar1.setName("Zayn");
		ar1.setId(101);
		sass.save(ar1);
		
		Author ar2=new Author();
		ar2.setAge(30);
		ar2.setName("Harry Styles");
		ar2.setId(102);
		sass.save(ar2);
		
		Author ar3=new Author();
		ar3.setAge(41);
		ar3.setName("Jay-Z");
		ar3.setId(103);
		sass.save(ar3);
		
		Author ar4=new Author();
		ar4.setAge(23);
		ar4.setName("Paul");
		ar4.setId(104);
		sass.save(ar4);
		
		Author ar5=new Author();
		ar5.setAge(26);
		ar5.setName("Louis");
		ar5.setId(105);
		sass.save(ar5);
		
		Author ar6=new Author();
		ar6.setAge(38);
		ar6.setName("Kanye");
		ar6.setId(106);
		sass.save(ar6);
		
		Author ar7=new Author();
		ar7.setAge(50);
		ar7.setName("Paul Maccartny");
		ar7.setId(107);
		sass.save(ar7);
		
		Author ar8=new Author();
		ar8.setAge(45);
		ar8.setName("Max");
		ar8.setId(108);
		sass.save(ar8);
		
		Author ar9=new Author();
		ar9.setAge(28);
		ar9.setName("Caroline");
		ar9.setId(109);
		sass.save(ar9);
		
		Author ar=new Author();
		ar.setAge(38);
		ar.setName("Brad");
		ar.setId(110);
		sass.save(ar);
		
		

		
		Book bk1=new Book();
		bk1.setName("Forged In Fire");
		bk1.setPrice((float) 650.00);
		bk1.setBid(7001);
		sass.save(bk1);
		
		Book bk2=new Book();
		bk2.setName("MIB 2");
		bk2.setPrice((float) 700.00);
		bk2.setBid(7002);
		sass.save(bk2);
		
		Book bk3=new Book();
		bk3.setName("Ready you");
		bk3.setPrice((float) 499.99);
		bk3.setBid(7003);
		sass.save(bk3);
		
		Book bk4=new Book();
		bk4.setName("HammerFist");
		bk4.setPrice((float) 730.00);
		bk4.setBid(7004);
		sass.save(bk4);
		
		Book bk5=new Book();
		bk5.setName("Incredibles");
		bk5.setPrice((float) 560.00);
		bk5.setBid(7005);
		sass.save(bk5);
		
		Book bk6=new Book();
		bk6.setName("The World Is Not Enough");
		bk6.setPrice((float) 908.38);
		bk6.setBid(7006);
		sass.save(bk6);
		
		Book bk7=new Book();
		bk7.setName("The Judge");
		bk7.setPrice((float) 276.00);
		bk7.setBid(7007);
		sass.save(bk7);
		
		Book bk8=new Book();
		bk8.setName("Scorpion");
		bk8.setPrice((float) 1530.00);
		bk8.setBid(7008);
		sass.save(bk8);
		
		Book bk9=new Book();
		bk9.setName("frozen");
		bk9.setPrice((float) 653.00);
		bk9.setBid(7009);
		sass.save(bk9);
		
		Book bk=new Book();
		bk.setName("Let me");
		bk.setPrice((float) 2000.00);
		bk.setBid(7010);
		sass.save(bk);
		
		sass.getTransaction().commit();
		sass.close();
		s.close();
		
	}

}
