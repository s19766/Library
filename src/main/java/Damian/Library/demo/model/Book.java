package Damian.Library.demo.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {

    @Id
    private int ID;
    private String name;
    private String author;
    private int pages;

    public Book(){

    }

    public Book(int ID, String name, String author, int pages) {
        this.ID = ID;
        this.name = name;
        this.author = author;
        this.pages = pages;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
