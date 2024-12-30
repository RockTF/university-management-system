package com.university.management.domain;

import java.util.List;

public class Teacher {
    private int id;
    private String name;
    private String subject;
    private List<Course> schedule;

    public Teacher(int id, String name, String subject, List<Course> schedule) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.schedule = schedule;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public List<Course> getSchedule() {
        return schedule;
    }

    public void setSchedule(List<Course> schedule) {
        this.schedule = schedule;
    }
}
