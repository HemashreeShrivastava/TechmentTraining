package com.techment.Mapping;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="author2000")
public class Author {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	@ManyToMany(targetEntity = Book.class)
	Set<Book> book;
	   public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public Author() {
			super();
		}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Book> getBook() {
		return book;
	}
	public void setBook(Set<Book> book) {
		this.book = book;
	}
	public Author(String name, Set<Book> book) {
		super();
		this.name = name;
		this.book = book;
	}
	

}
