package com.example.asus.dine_restaurant_finder.Event;

public class NewGrid_Class {
    private int Id;
    private String Title;
    private String Date;
    private String Content;
    private String Img;

    public NewGrid_Class(int id, String title, String date, String content, String img) {
        Id = id;
        Title = title;
        Date = date;
        Content = content;
        Img = img;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public String getImg() {
        return Img;
    }

    public void setImg(String img) {
        Img = img;
    }
}
