package com.university.management.domain;

import java.util.Date;

public class Transaction {
    private int id;
    private Student student;
    private Book book;
    private Date issueDate;
    private Date returnDate;

    public Transaction(int id, Student student, Book book, Date issueDate, Date returnDate) {
        this.id = id;
        this.student = student;
        this.book = book;
        this.issueDate = issueDate;
        this.returnDate = returnDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
}

