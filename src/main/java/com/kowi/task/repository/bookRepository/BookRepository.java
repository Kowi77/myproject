package com.kowi.task.repository.bookRepository;

import com.kowi.task.model.books.Book;

import java.util.List;

public interface BookRepository {

    List<? extends Book> getAll();

}
