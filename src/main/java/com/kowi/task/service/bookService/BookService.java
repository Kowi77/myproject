package com.kowi.task.service.bookService;

import com.kowi.task.model.books.Book;

import java.util.List;

interface BookService {

    List<? extends Book> getAll();

  }
