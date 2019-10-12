package Damian.Library.demo.service;

import Damian.Library.demo.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class BookService {

    public List<Book> finaAll(){
        List<Book> bookList = new ArrayList<>();

        Book book1 = new Book (1, "Pan Lodowego Ogrodu 1", "Grzedowicz",  512);
        Book book2 = new Book (2, "Pan Lodowego Ogrodu 2", "Grzedowicz",  300);
        Book book3 = new Book (3, "Pan Lodowego Ogrodu 3", "Grzedowicz",  212);

        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);

        return bookList;
    }




}
