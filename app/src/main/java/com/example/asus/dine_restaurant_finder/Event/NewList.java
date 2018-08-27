package com.example.asus.dine_restaurant_finder.Event;

public class NewList {
    private int Id;
    private String Title;
    private String Date;
    private String Content;
    private String Image;

    public NewList(int id, String title, String date, String content, String image) {
        Id = id;
        Title = title;
        Date = date;
        Content = content;
        Image = image;
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

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }
}
