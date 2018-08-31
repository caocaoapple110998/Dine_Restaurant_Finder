package com.example.asus.dine_restaurant_finder.Event;

public class Comment_Class {
    private int Id;
    private String Name;
    private String Hours;
    private String Content;

    public Comment_Class(int id, String name, String hours, String content) {
        Id = id;
        Name = name;
        Hours = hours;
        Content = content;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getHours() {
        return Hours;
    }

    public void setHours(String hours) {
        Hours = hours;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
}
