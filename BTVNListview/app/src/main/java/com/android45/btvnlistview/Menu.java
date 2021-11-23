package com.android45.btvnlistview;

public class Menu {
    boolean img;
    String foodName;
    int rate;
    int soluong;
    String foodInfor, ship;
    int time;
    String money;

    public Menu(boolean img, String foodName, int rate, int soluong, String foodInfor, String ship, int time, String money) {
        this.img = img;
        this.foodName = foodName;
        this.rate = rate;
        this.soluong = soluong;
        this.foodInfor = foodInfor;
        this.ship = ship;
        this.time = time;
        this.money = money;
    }

    public boolean isImg() {
        return img;
    }

    public void setImg(boolean img) {
        this.img = img;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getFoodInfor() {
        return foodInfor;
    }

    public void setFoodInfor(String foodInfor) {
        this.foodInfor = foodInfor;
    }

    public String getShip() {
        return ship;
    }

    public void setShip(String ship) {
        this.ship = ship;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }
}
