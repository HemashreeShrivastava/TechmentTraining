package com.UnidirectionalOneToMany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Book100")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	String author;
	@ManyToOne
	@JoinColumn(name="libraryid")
	Library library;
	public String getAuthor() {
		return author;
	}
	public Book(String name, String author, Library library) {
		super();
		this.name = name;
		this.author = author;
		this.library = library;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Book(String name) {
		super();
		this.name = name;
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


}
