package com.Techment.OppsAssignment_1;
import java.util.*;
class Book
{
	private int bookNo;
	private String title;
	private String author;
	private float price;
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
}

class EngineeringBook extends Book
{
	private String category ;
	

	public EngineeringBook() {
		super();
		
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
}

public class BookDetail {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		/*Book book =new Book();
		System.out.println("enter the author name");
		book.setAuthor(scanner.next());
		System.out.println("enter the book number");
		book.setBookNo(scanner.nextInt());
		System.out.println("enter the price of book");
		book.setPrice(scanner.nextFloat());
		System.out.println("enter the title of book");
		book.setTitle(scanner.next());
		System.out.println("author name"+" "+book.getAuthor());
		System.out.println("book number"+" "+book.getBookNo());
		System.out.println("price"+" "+book.getPrice());
		System.out.println("title"+" "+book.getTitle());*/
		
		EngineeringBook engbook =new EngineeringBook();
		System.out.println("enter the author name");
		engbook.setAuthor(scanner.next());
		System.out.println("enter the book number");
		engbook.setBookNo(scanner.nextInt());
		System.out.println("enter the price of book");
		engbook.setPrice(scanner.nextFloat());
		System.out.println("enter the title of book");
		engbook.setTitle(scanner.next());
		System.out.println("enter the category of book");
		engbook.setCategory(scanner.next());
		System.out.println("author name"+" "+engbook.getAuthor());
		System.out.println("book number"+" "+engbook.getBookNo());
		System.out.println("price"+" "+engbook.getPrice());
		System.out.println("title"+" "+engbook.getTitle());
		System.out.println("category"+" "+engbook.getCategory());
		
		
	

	}

}
