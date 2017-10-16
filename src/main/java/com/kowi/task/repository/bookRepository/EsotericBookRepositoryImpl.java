package com.kowi.task.repository.bookRepository;

import com.kowi.task.model.books.EsotericBook;
import org.springframework.stereotype.Repository;

import static com.kowi.task.utils.ProductData.ESOTERIC_BOOKS;

import java.util.List;

@Repository
public class EsotericBookRepositoryImpl implements BookRepository {

    @Override
    public List<EsotericBook> getAll(){ return ESOTERIC_BOOKS; }

    @Override
    public EsotericBook get(int id) {
        return ESOTERIC_BOOKS.stream().filter(b -> b.getId() == id).findFirst().get();
    }
}