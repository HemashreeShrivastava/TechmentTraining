package com.techment.BookAuthor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="book8000")
public class Books {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int ISBN;
	String name;
	int price;
	@ManyToOne
	@JoinColumn(name="authorId")
	Author1 author;
	public int getISBN() {
		return ISBN;
	}
	@Override
	public String toString() {
		return "Books [ISBN=" + ISBN + ", name=" + name + ", price=" + price + ", author=" + author + "]";
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Author1 getAuthor() {
		return author;
	}
	public void setAuthor(Author1 author) {
		this.author = author;
	}
	public Books() {
		super();
	}
	public Books(String name, int price, Author1 author) {
		super();
		this.name = name;
		this.price = price;
		this.author = author;
	}

	
}
