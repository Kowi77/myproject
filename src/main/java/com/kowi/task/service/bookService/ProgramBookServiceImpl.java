package com.kowi.task.service.bookService;

import com.kowi.task.model.books.ProgramBook;
import com.kowi.task.repository.bookRepository.ProgramBookRepositoryImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgramBookServiceImpl implements BookService {

    private ProgramBookRepositoryImpl repository;

    @Autowired
    public ProgramBookServiceImpl(ProgramBookRepositoryImpl repository) {
        this.repository = repository;
    }

    @Override
    public List<ProgramBook> getAll() {
        return repository.getAll();
    }

    public ProgramBook get(int id) {return repository.get(id);}
}
