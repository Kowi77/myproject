package com.kowi.task.service.bookService;

import com.kowi.task.model.books.CockBook;
import com.kowi.task.repository.bookRepository.CockBookRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CockBookServiceImpl implements BookService {

    private CockBookRepositoryImpl repository;

    @Autowired
    public CockBookServiceImpl(CockBookRepositoryImpl repository) {
        this.repository = repository;
    }

    @Override
    public List<CockBook> getAll() {
        return repository.getAll();
    }
}


