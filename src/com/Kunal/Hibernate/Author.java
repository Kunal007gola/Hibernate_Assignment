package com.Kunal.Hibernate;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Author {

	@Id
	@Column(name="author_id")
	private int id;

	private String name;
	private int age;
	

	@Embedded
	@ElementCollection
	private Set<Author_Address> addressList = new HashSet<>();
	
	public Set<Author_Address> getAddressList() {
		return addressList;
	}
	public void setAddressList(Set<Author_Address> addressList) {
		this.addressList = addressList;
	}
	@ManyToMany(cascade=CascadeType.ALL)
	private Set<Book> book=new HashSet<>();
	
	public Set<Book> getBook() {
		return book;
	}
	public void setBook(Set<Book> book) {
		this.book = book;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
