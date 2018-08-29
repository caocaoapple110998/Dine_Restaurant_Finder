package com.example.asus.dine_restaurant_finder.Event;

public class Item_list2_Class {

    private int Id;
    private String Rating;
    private String Name;
    private String Address;
    private String Foods;
    private String Price;
    private String Save;
    private String Old_price;
    private String Date;
    private String Imghinh;


    public Item_list2_Class(int id, String rating, String name, String address, String foods, String price, String save, String old_price, String date, String imghinh) {
        Id = id;
        Rating = rating;
        Name = name;
        Address = address;
        Foods = foods;
        Price = price;
        Save = save;
        Old_price = old_price;
        Date = date;
        Imghinh = imghinh;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getRating() {
        return Rating;
    }

    public void setRating(String rating) {
        Rating = rating;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getFoods() {
        return Foods;
    }

    public void setFoods(String foods) {
        Foods = foods;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getSave() {
        return Save;
    }

    public void setSave(String save) {
        Save = save;
    }

    public String getOld_price() {
        return Old_price;
    }

    public void setOld_price(String old_price) {
        Old_price = old_price;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getImghinh() {
        return Imghinh;
    }

    public void setImghinh(String imghinh) {
        Imghinh = imghinh;
    }
}