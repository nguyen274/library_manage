package com.project.library.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.project.library.model.Book;

@Repository
public interface BookService {
    List<Book> getAllBook();
    
    void addNew(Book book);

    Book saveBook(Book book);

    void deleteBook(Long id);

    Optional<Book> findBookById(Long id);
}
