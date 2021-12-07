package com.android45.foodminiproject.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Cart {
    private BigDecimal totalPrice = BigDecimal.ZERO;
    private List<FoodMenu> foodMenuList = new ArrayList<FoodMenu>();

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<FoodMenu> getFoodMenuList() {
        return foodMenuList;
    }

    public void setFoodMenuList(List<FoodMenu> foodMenuList) {
        this.foodMenuList = foodMenuList;
    }
}
