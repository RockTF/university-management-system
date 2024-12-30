package com.university.management.domain;

import java.util.List;

public class Dormitory {
    private int id;
    private List<Room> rooms;
    private List<Student> students;

    public Dormitory(int id, List<Room> rooms, List<Student> students) {
        this.id = id;
        this.rooms = rooms;
        this.students = students;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
