package com.university.management.domain;

import java.util.List;
import java.util.Map;

public class Student {
    private int id;
    private String name;
    private List<Course> courses;
    private Map<Course, Float> grades;
    private Room dormRoom;
    private List<Transaction> transactions;

    public Student(int id, String name, List<Course> courses, Map<Course, Float> grades, Room dormRoom, List<Transaction> transactions) {
        this.id = id;
        this.name = name;
        this.courses = courses;
        this.grades = grades;
        this.dormRoom = dormRoom;
        this.transactions = transactions;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public Map<Course, Float> getGrades() {
        return grades;
    }

    public void setGrades(Map<Course, Float> grades) {
        this.grades = grades;
    }

    public Room getDormRoom() {
        return dormRoom;
    }

    public void setDormRoom(Room dormRoom) {
        this.dormRoom = dormRoom;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
}
