package com.android45.btvnlistview;

public class FoodMenu {
    boolean imgMonAn;
    String tvMonAn;
    int rbStar;
    String tvSoLuong, tvInfor, tvShip, tvTime, tvMoney;

    public FoodMenu(boolean imgMonAn, String tvMonAn, int rbStar, String tvSoLuong, String tvInfor, String tvShip, String tvTime, String tvMoney) {
        this.imgMonAn = imgMonAn;
        this.tvMonAn = tvMonAn;
        this.rbStar = rbStar;
        this.tvSoLuong = tvSoLuong;
        this.tvInfor = tvInfor;
        this.tvShip = tvShip;
        this.tvTime = tvTime;
        this.tvMoney = tvMoney;
    }

    public boolean isImgMonAn() {
        return imgMonAn;
    }

    public void setImgMonAn(boolean imgMonAn) {
        this.imgMonAn = imgMonAn;
    }

    public String getTvMonAn() {
        return tvMonAn;
    }

    public void setTvMonAn(String tvMonAn) {
        this.tvMonAn = tvMonAn;
    }

    public int getRbStar() {
        return rbStar;
    }

    public void setRbStar(int rbStar) {
        this.rbStar = rbStar;
    }

    public String getTvSoLuong() {
        return tvSoLuong;
    }

    public void setTvSoLuong(String tvSoLuong) {
        this.tvSoLuong = tvSoLuong;
    }

    public String getTvInfor() {
        return tvInfor;
    }

    public void setTvInfor(String tvInfor) {
        this.tvInfor = tvInfor;
    }

    public String getTvShip() {
        return tvShip;
    }

    public void setTvShip(String tvShip) {
        this.tvShip = tvShip;
    }

    public String getTvTime() {
        return tvTime;
    }

    public void setTvTime(String tvTime) {
        this.tvTime = tvTime;
    }

    public String getTvMoney() {
        return tvMoney;
    }

    public void setTvMoney(String tvMoney) {
        this.tvMoney = tvMoney;
    }
}
