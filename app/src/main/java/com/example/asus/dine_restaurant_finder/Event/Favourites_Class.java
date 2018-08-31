package com.example.asus.dine_restaurant_finder.Event;

public class Favourites_Class {
    private int Id;
    private String Title;
    private String Content;
    private String imgHinh;

    public Favourites_Class(int id, String title, String content, String imgHinh) {
        Id = id;
        Title = title;
        Content = content;
        this.imgHinh = imgHinh;
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

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public String getImgHinh() {
        return imgHinh;
    }

    public void setImgHinh(String imgHinh) {
        this.imgHinh = imgHinh;
    }
}
