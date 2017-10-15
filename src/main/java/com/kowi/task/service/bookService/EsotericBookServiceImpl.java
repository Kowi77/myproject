package com.kowi.task.service.bookService;

import com.kowi.task.model.books.EsotericBook;
import com.kowi.task.repository.bookRepository.EsotericBookRepositoryImpl;

import com.kowi.task.service.bookService.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EsotericBookServiceImpl implements BookService {

    private EsotericBookRepositoryImpl repository;

    @Autowired
    public EsotericBookServiceImpl(EsotericBookRepositoryImpl repository) {
        this.repository = repository;
    }

    @Override
    public List<EsotericBook> getAll() {
        return repository.getAll();
    }

    public EsotericBook get(int id) {return repository.get(id);}
}
