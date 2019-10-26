package Damian.Library.demo.service;

import Damian.Library.demo.model.Book;
import Damian.Library.demo.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> finaAll(){

        return bookRepository.findAll();
    }

    public Book saveBook(Book model){
            return bookRepository.save(model);
    }
}
