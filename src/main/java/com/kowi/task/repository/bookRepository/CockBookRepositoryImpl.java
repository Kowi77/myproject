package com.kowi.task.repository.bookRepository;

import com.kowi.task.model.books.CockBook;
import org.springframework.stereotype.Repository;
import static com.kowi.task.utils.ProductData.COCK_BOOKS;

import java.util.List;

@Repository
public class CockBookRepositoryImpl implements BookRepository {

    public List<CockBook> getAll() {
        return COCK_BOOKS;
    }

    public CockBook get (int id){
        return COCK_BOOKS.stream().filter(b -> b.getId() == id).findFirst().get();
    }
}
