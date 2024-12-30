package com.university.management.domain;

import java.util.List;

public class Course {
    private int id;
    private String name;
    private Teacher teacher;
    private List<String> schedule;

    public Course(int id, String name, Teacher teacher, List<String> schedule) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;
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

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<String> getSchedule() {
        return schedule;
    }

    public void setSchedule(List<String> schedule) {
        this.schedule = schedule;
    }
}
