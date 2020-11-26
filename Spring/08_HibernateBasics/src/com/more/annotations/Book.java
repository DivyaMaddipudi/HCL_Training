package com.more.annotations;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.Type;



@Entity
@Table(name = "book_more_anno")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(unique = true, name = "book_isbn", nullable = false, length = 50)
	private String isbn;
	
	@Column(name="book_title", nullable = false, length = 100)
	private String title;
	
	@Column(name="book_author", nullable = false, length = 100)
	private String author;
	
	@Column(name="book_pub_date", nullable = false, length = 100)
	@Temporal(TemporalType.DATE)
	private Date pubDate;
	
//	@Basic
	@Column(name="book_price", nullable = false, precision = 2)
	private double price;
	
	@Transient //hey hib dont store it into db
	private double tempPassword;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date punchCardTim;
	
	public Book() {
		
	}
	
	

	public Book(int id, String isbn, String title, String author, Date pubDate, double price, double tempPassword,
			Date punchCardTim) {
		super();
		this.id = id;
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.pubDate = pubDate;
		this.price = price;
		this.tempPassword = tempPassword;
		this.punchCardTim = punchCardTim;
	}



	public Book(int id, String isbn, String title, String author, Date pubDate, double price) {
		super();
		this.id = id;
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.pubDate = pubDate;
		this.price = price;
	}

	public Book(String isbn, String title, String author, Date pubDate, double price) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.pubDate = pubDate;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
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

	public Date getPubDate() {
		return pubDate;
	}

	public void setPubDate(Date pubDate) {
		this.pubDate = pubDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", isbn=" + isbn + ", title=" + title + ", author=" + author + ", pubDate=" + pubDate
				+ ", price=" + price + "]";
	}

}
