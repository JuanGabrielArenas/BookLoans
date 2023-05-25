package com.seminario1.demo.Domain.model.gateways;

import com.seminario1.demo.Domain.model.Book;

public interface BookRepository {
    Book saveBook(Book book);
    Book getBookById(String isbn);
}
