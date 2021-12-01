package com.android45.foodminiproject.model;

public class AddToCart {
    int imgFood;
    String tvFood;
    String tvPrice;
    int soLuong;

    public AddToCart(int imgFood, String tvFood, String tvPrice, int soLuong) {
        this.imgFood = imgFood;
        this.tvFood = tvFood;
        this.tvPrice = tvPrice;
        this.soLuong = soLuong;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getImgFood() {
        return imgFood;
    }

    public void setImgFood(int imgFood) {
        this.imgFood = imgFood;
    }

    public String getTvFood() {
        return tvFood;
    }

    public void setTvFood(String tvFood) {
        this.tvFood = tvFood;
    }

    public String getTvPrice() {
        return tvPrice;
    }

    public void setTvPrice(String tvPrice) {
        this.tvPrice = tvPrice;
    }
}
