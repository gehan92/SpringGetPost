package com.example.demo;

import java.util.Date;

public class Book {
	private Integer bookId;
	private String bookname;
	private Date publishDate;
	
	
	public Book(Integer bookId, String bookname, Date publishDate) {
		super();
		this.bookId = bookId;
		this.bookname = bookname;
		this.publishDate = publishDate;
	}
	
	
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookname=" + bookname + ", publishDate=" + publishDate + "]";
	}
	
	

}
