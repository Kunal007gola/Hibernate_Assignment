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
		
		Book bk1=new Book();
		bk1.setName("MIB 2");
		bk1.setPrice((float) 700.00);
		bk1.setBid(7011);
		
		Book bk2=new Book();
		bk2.setName("Speed");
		bk2.setPrice((float) 50.00);
		bk2.setBid(7012);
		
		Author_Address autadd=new Author_Address();
		autadd.setHouseNo(104);
		autadd.setCity("Old Delhi");
		autadd.setPinCode(110006);
		autadd.setState("Delhi");
		autadd.setStreet("Chawri Bazar");
		
		Author_Address autadd1=new Author_Address();
		autadd1.setHouseNo(653);
		autadd1.setCity("Chandigarh");
		autadd1.setPinCode(210037);
		autadd1.setState("Punjab");
		autadd1.setStreet("Lodi Road");
		
		Author_Address autadd2=new Author_Address();
		autadd2.setHouseNo(076);
		autadd2.setCity("New Delhi");
		autadd2.setPinCode(110052);
		autadd2.setState("Delhi");
		autadd2.setStreet("Karol bagh");
		
		Author ar=new Author();
		ar.setAge(47);
		ar.setName("Zayn");
		ar.setId(101);
		
		Author ar2=new Author();
		ar2.setAge(30);
		ar2.setName("Harry Styles");
		ar2.setId(102);
		
		ar.getBook().add(bk1);
		ar.getBook().add(bk);
		ar2.getBook().add(bk2);
		ar.getAddressList().add(autadd2);
		ar.getAddressList().add(autadd1);
		ar2.getAddressList().add(autadd);
		
		sass.save(bk);
		sass.save(bk1);
		sass.save(bk2);
		sass.save(ar2);
		sass.save(ar);
		
		sass.getTransaction().commit();
		sass.close();
		s.close();
		
	}

}
