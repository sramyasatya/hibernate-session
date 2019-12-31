package com.ramya.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Books {

	@Id
	@Column(name="book_id")
	private int bookId;
	@Column(name="book_name")
	private String bookName;
	
	@ManyToMany
	@JoinTable(name="Join_Author_Book",
	joinColumns= {@JoinColumn(name="book_id")},
	inverseJoinColumns= {@JoinColumn(name="author_id")})
	private List<Author> author=new ArrayList<Author>();

	public Books() {
		super();
	}

	public Books(int bookId, String bookName, List<Author> author) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public List<Author> getAuthor() {
		return author;
	}

	public void setAuthor(List<Author> author) {
		this.author = author;
	}
	
	
}
