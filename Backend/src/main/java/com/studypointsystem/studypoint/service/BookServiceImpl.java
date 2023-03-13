package com.studypointsystem.studypoint.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studypointsystem.studypoint.entity.Book;
import com.studypointsystem.studypoint.repository.BookRepository;


@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookRepository bookRepository;

	@Override
	public List<Book> getAllBook() {
		return bookRepository.findAll();
		
	}

	@Override
	public Book addBook(Book book) {
		
		bookRepository.save(book);
		return book;
	}

	@Override
	public Book updateBook(Book book) {
		
		bookRepository.save(book);
		return book;
	}

	@Override
	public void deleteBook(String bookId) {
		Optional<Book> entity = bookRepository.findById(bookId);
		Book foundBook = entity.get();
		bookRepository.delete(foundBook);
		}
	
	@Override
	public Book getBook(String bookId) {
		Optional<Book> entity= bookRepository.findById(bookId);
		Book foundBook = entity.get();
		return foundBook;
	}
}
