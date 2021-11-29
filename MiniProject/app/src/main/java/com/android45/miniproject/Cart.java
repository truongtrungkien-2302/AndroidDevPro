package com.android45.miniproject;

public class Cart extends FoodMenu{
    public Cart(int imgFood, String tvFood, float rbStart, String tvPrice) {
        super(imgFood, tvFood, rbStart, tvPrice);
    }

    @Override
    public int getImgFood() {
        return super.getImgFood();
    }

    @Override
    public void setImgFood(int imgFood) {
        super.setImgFood(imgFood);
    }

    @Override
    public String getTvFood() {
        return super.getTvFood();
    }

    @Override
    public void setTvFood(String tvFood) {
        super.setTvFood(tvFood);
    }

    @Override
    public float getRbStart() {
        return super.getRbStart();
    }

    @Override
    public void setRbStart(float rbStart) {
        super.setRbStart(rbStart);
    }

    @Override
    public String getTvPrice() {
        return super.getTvPrice();
    }

    @Override
    public void setTvPrice(String tvPrice) {
        super.setTvPrice(tvPrice);
    }
}
