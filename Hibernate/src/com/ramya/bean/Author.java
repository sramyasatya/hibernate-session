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
@Table(name="author")
public class Author {

	@Id
	@Column(name="author_id")
	private int authorId;
	@Column(name="author_name")
	private String authorName;
	
	@ManyToMany
	@JoinTable(name="Join_Author_Book",
	joinColumns= {@JoinColumn(name="author_id")},
	inverseJoinColumns= {@JoinColumn(name="book_id")})
	private List<Books> book=new ArrayList<Books>();

	public Author() {
		super();
	}

	public Author(int authorId, String authorName, List<Books> book) {
		super();
		this.authorId = authorId;
		this.authorName = authorName;
		this.book = book;
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public List<Books> getBook() {
		return book;
	}

	public void setBook(List<Books> book) {
		this.book = book;
	}
	
	
}
