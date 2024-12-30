package com.university.management.domain;

import java.util.List;

public class Room {
    private int id;
    private String number;
    private int capacity;
    private List<Student> occupants;

    public Room(int id, String number, int capacity, List<Student> occupants) {
        this.id = id;
        this.number = number;
        this.capacity = capacity;
        this.occupants = occupants;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Student> getOccupants() {
        return occupants;
    }

    public void setOccupants(List<Student> occupants) {
        this.occupants = occupants;
    }
}
