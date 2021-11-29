package com.android45.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ActivityFoodMenu extends AppCompatActivity {
    ListView lvFood;
    List<FoodMenu> foodMenuList;
    FoodMenu foodMenu1, foodMenu2, foodMenu3, foodMenu4, foodMenu5;
    TextView tvName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_menu);
        lvFood = findViewById(R.id.lvFood);
        tvName = findViewById(R.id.tvName);

        Intent intent = getIntent();

        String strName = intent.getStringExtra("Keyname");
        tvName.setText(strName);

        foodMenuList = new ArrayList<>();
        foodMenuList.add(new FoodMenu(R.drawable.eggsand, "Egg Salad Sandwich", 4, "60.000"));
        foodMenuList.add(new FoodMenu(R.drawable.ham, "Ham & Cheese Sandwich", 5, "65.000"));
        foodMenuList.add(new FoodMenu(R.drawable.chicken, "Chicken Salad Sandwich", 4, "75.000"));
        foodMenuList.add(new FoodMenu(R.drawable.turkey, "French fries & Turkey Sandwich", 4.5F, "70.000"));
        foodMenuList.add(new FoodMenu(R.drawable.beef, "Beef Rib Burger", 5, "80.000"));

        AdapterFood adapterFood = new AdapterFood(foodMenuList);
        lvFood.setAdapter(adapterFood);
    }
}