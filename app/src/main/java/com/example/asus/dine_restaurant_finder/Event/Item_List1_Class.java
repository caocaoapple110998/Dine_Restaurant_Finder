package com.example.asus.dine_restaurant_finder.Event;

/**
 * Created by Administrator on 24/08/2018.
 */

public class Item_List1_Class {

    private int id;
    private String Title;
    private String Address;
    private String ImgHinh;

    public Item_List1_Class(int id, String title, String address, String imgHinh) {
        this.id = id;
        Title = title;
        Address = address;
        ImgHinh = imgHinh;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getImgHinh() {
        return ImgHinh;
    }

    public void setImgHinh(String imgHinh) {
        ImgHinh = imgHinh;
    }
}
