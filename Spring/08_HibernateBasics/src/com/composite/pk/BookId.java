package com.composite.pk;

import java.io.Serializable;

import javax.persistence.Embeddable;

//@Embeddable
final public class BookId implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String isbn;
	
	private String title;

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

	public BookId(String isbn, String title) {
		super();
		this.isbn = isbn;
		this.title = title;
	}

	public BookId() {
		super();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookId other = (BookId) obj;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BookId [isbn=");
		builder.append(isbn);
		builder.append(", title=");
		builder.append(title);
		builder.append("]");
		return builder.toString();
	}
	
}
