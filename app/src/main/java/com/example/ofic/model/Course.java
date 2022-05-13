package com.example.ofic.model;

public class Course {

    int id;
    String img, officiant, guests, time, color;

    public Course(int id, String img, String officiant, String guests, String time, String color) {
        this.id = id;
        this.img = img;
        this.officiant = officiant;
        this.guests = guests;
        this.time = time;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getOfficiant() {
        return officiant;
    }

    public void setOfficiant(String officiant) {
        this.officiant = officiant;
    }

    public String getGuests() {
        return guests;
    }

    public void setGuests(String guests) {
        this.guests = guests;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
