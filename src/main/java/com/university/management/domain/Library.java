package com.university.management.domain;

import java.util.List;

public class Library {
    private int id;
    private List<Book> books;
    private List<Transaction> transactions;

    public Library(int id, List<Book> books, List<Transaction> transactions) {
        this.id = id;
        this.books = books;
        this.transactions = transactions;
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

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
}
