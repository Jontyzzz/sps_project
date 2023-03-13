package com.studypointsystem.studypoint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.studypointsystem.studypoint.entity.Book;
import com.studypointsystem.studypoint.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	public BookService bookService;
	
	@GetMapping("/books")
	@ResponseBody
	public List<Book> getAllBook(){
		return this.bookService.getAllBook();
	}
		
	@PostMapping("/book")
	public Book addBook(@RequestBody Book book) {		
			return this.bookService.addBook(book);
	}
	
	@PutMapping("/book")
	public Book updateUser(@RequestBody Book book) {
		return this.bookService.updateBook(book);
	}
	
	@GetMapping("/book/{bookId}")
	public Book getUser (@PathVariable String bookId) {
		return this.bookService.getBook(bookId);
	}
	
	@DeleteMapping("/book/{bookId}")
	public ResponseEntity<HttpStatus>deleteUser(@PathVariable String bookId)
	{
		try {
			this.bookService.deleteBook(bookId);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
