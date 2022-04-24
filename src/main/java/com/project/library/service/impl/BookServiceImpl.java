package com.project.library.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.library.model.Book;
import com.project.library.repository.BookRepository;
import com.project.library.service.BookService;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookRepository bookRepository;
	
	@Override
	public List<Book> getAllBook() {
		return (List<Book>) bookRepository.findAll();
	}

	@Override
	public void addNew(Book book) {
		bookRepository.save(book);
		
	}

	@Override
	public Book saveBook(Book book) {
		bookRepository.save(book);
		return book;
	}

	@Override
	public void deleteBook(Long id) {
		bookRepository.deleteById(id);
	}

	@Override
	public Optional<Book> findBookById(Long id) {
		return bookRepository.findById(id);
	}

}
