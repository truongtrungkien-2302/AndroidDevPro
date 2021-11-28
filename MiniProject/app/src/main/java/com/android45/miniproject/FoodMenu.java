package com.android45.miniproject;

public class FoodMenu {
    int imgFood;
    String tvFood;
    float rbStart;
    String tvPrice;

    public FoodMenu(int imgFood, String tvFood, float rbStart, String tvPrice) {
        this.imgFood = imgFood;
        this.tvFood = tvFood;
        this.rbStart = rbStart;
        this.tvPrice = tvPrice;
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

    public float getRbStart() {
        return rbStart;
    }

    public void setRbStart(float rbStart) {
        this.rbStart = rbStart;
    }

    public String getTvPrice() {
        return tvPrice;
    }

    public void setTvPrice(String tvPrice) {
        this.tvPrice = tvPrice;
    }
}
