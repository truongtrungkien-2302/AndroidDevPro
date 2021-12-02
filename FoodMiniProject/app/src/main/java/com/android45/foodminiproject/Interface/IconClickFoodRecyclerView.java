package com.android45.foodminiproject.Interface;

import android.view.View;

import com.android45.foodminiproject.adapter.FoodRecyclerViewAdapter;
import com.android45.foodminiproject.model.FoodMenu;

public interface IconClickFoodRecyclerView {
    void onClickAddToCart(FoodMenu foodMenu);
    void onClickItem(FoodRecyclerViewAdapter foodRecyclerViewAdapter, View view, int quantity, long l);
}
