package com.example.asus.dine_restaurant_finder.Event;

public class Item_list2_Class {

    private String rating;
    private String ten;
    private String mota;
    private String diachi;
    private String gia;
    private String save;
    private String giacu;
    private String ngay;
    private int anh;

    public Item_list2_Class(String rating, String ten, String mota, String diachi, String gia, String save, String giacu, String ngay, int anh) {
        this.rating = rating;
        this.ten = ten;
        this.mota = mota;
        this.diachi = diachi;
        this.gia = gia;
        this.save = save;
        this.giacu = giacu;
        this.ngay = ngay;
        this.anh = anh;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getSave() {
        return save;
    }

    public void setSave(String save) {
        this.save = save;
    }

    public String getGiacu() {
        return giacu;
    }

    public void setGiacu(String giacu) {
        this.giacu = giacu;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public int getAnh() {
        return anh;
    }

    public void setAnh(int anh) {
        this.anh = anh;
    }
}
