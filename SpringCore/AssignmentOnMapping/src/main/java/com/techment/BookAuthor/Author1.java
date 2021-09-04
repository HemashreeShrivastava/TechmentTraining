package com.techment.BookAuthor;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="author8000")
public class Author1 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	@OneToMany(mappedBy = "author" , cascade = CascadeType.ALL)
	Set<Books> book;
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
	public Set<Books> getBook() {
		return book;
	}
	public void setBook(Set<Books> book) {
		this.book = book;
	}
	public Author1(String name, Set<Books> book) {
		super();
		this.name = name;
		this.book = book;
	}
	public Author1() {
		super();
	}
	@Override
	public String toString() {
		return "Author1 [id=" + id + ", name=" + name + ", book=" + book + "]";
	}
	

}
