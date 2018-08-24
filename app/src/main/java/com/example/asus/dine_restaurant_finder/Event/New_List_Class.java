package com.example.asus.dine_restaurant_finder.Event;

import android.widget.TextView;

/**
 * Created by Administrator on 24/08/2018.
 */

public class New_List_Class {
    private String tieude;
    private String ngay;
    private String noidung;
    private int hinh;

    public New_List_Class(String tieude, String ngay, String noidung, int hinh) {
        this.tieude = tieude;
        this.ngay = ngay;
        this.noidung = noidung;
        this.hinh = hinh;
    }

    public String getTieude() {
        return tieude;
    }

    public void setTieude(String tieude) {
        this.tieude = tieude;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
