package com.example.asus.dine_restaurant_finder.Event;

import android.widget.RatingBar;

/**
 * Created by Administrator on 24/08/2018.
 */

public class Item_List1_Class {
    private String tieude;
    private String located;
    private String diachi;
    private String detail;
    private RatingBar ratingBar;
    private int hinh;

    public Item_List1_Class(String tieude, String located, String diachi, String detail, RatingBar ratingBar, int hinh) {
        this.tieude = tieude;
        this.located = located;
        this.diachi = diachi;
        this.detail = detail;
        this.ratingBar = ratingBar;
        this.hinh = hinh;
    }

    public String getTieude() {
        return tieude;
    }

    public void setTieude(String tieude) {
        this.tieude = tieude;
    }

    public String getLocated() {
        return located;
    }

    public void setLocated(String located) {
        this.located = located;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public RatingBar getRatingBar() {
        return ratingBar;
    }

    public void setRatingBar(RatingBar ratingBar) {
        this.ratingBar = ratingBar;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
