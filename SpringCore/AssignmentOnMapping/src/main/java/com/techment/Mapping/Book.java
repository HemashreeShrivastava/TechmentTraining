package com.techment.Mapping;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="book2000")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int ISBN;
	String name;
	Float price;
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public Book() {
		super();
	}
	@ManyToMany(targetEntity = Author.class)
	Set<Author> author;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Set<Author> getAuthor() {
		return author;
	}
	public void setAuthor(Set<Author> author) {
		this.author = author;
	}
	public Book(String name, Float price, Set<Author> author) {
		super();
		this.name = name;
		this.price = price;
		this.author = author;
	}
	
		
}
