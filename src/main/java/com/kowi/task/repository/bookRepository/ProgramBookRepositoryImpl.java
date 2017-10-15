package com.kowi.task.repository.bookRepository;

import com.kowi.task.model.books.Book;
import com.kowi.task.model.books.ProgramBook;
import org.springframework.stereotype.Repository;

import static com.kowi.task.utils.ProductData.PROGRAM_BOOKS;

import java.util.List;

@Repository
public class ProgramBookRepositoryImpl implements BookRepository {

    @Override
    public List<ProgramBook> getAll(){ return PROGRAM_BOOKS; }

    @Override
    public ProgramBook get(int id) {
        return PROGRAM_BOOKS.stream().filter(b -> b.getId() == id).findFirst().get();
    }
}
