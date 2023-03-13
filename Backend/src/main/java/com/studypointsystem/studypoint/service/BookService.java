package com.studypointsystem.studypoint.service;

import java.util.List;

import com.studypointsystem.studypoint.entity.Book;


public interface BookService {
	
	public List<Book> getAllBook();
	
	public Book getBook(String  bookId);

	public Book addBook(Book book);
	
	public Book updateBook(Book book);
	
	public void deleteBook(String bookId);

}
