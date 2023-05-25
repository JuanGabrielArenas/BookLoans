package com.seminario1.demo.Domain.usecase;

import com.seminario1.demo.Domain.model.Book;
import com.seminario1.demo.Domain.model.gateways.BookRepository;

public class BookUseCase {
    private final BookRepository bookRepository;

    public BookUseCase(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book createBook(Book book){
        return bookRepository.saveBook(book);
    }

    public BookRepository getBookRepository() {
        return bookRepository;
    }
    public Book getBookById(String isbn){
        return bookRepository.getBookById(isbn);
    }
}
