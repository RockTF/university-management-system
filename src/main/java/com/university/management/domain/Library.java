package com.university.management.domain;

import java.util.List;
import java.util.Map;

public class Library {
    private int id;
    private List<Book> books;
    private Map<Student, Book> borrowers;

    public Library(int id, List<Book> books, Map<Student, Book> borrowers) {
        this.id = id;
        this.books = books;
        this.borrowers = borrowers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Map<Student, Book> getBorrowers() {
        return borrowers;
    }

    public void setBorrowers(Map<Student, Book> borrowers) {
        this.borrowers = borrowers;
    }
}
