package com.android45.miniproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ActivityFoodMenu extends AppCompatActivity {
//    ListView lvFood;
    RecyclerView rvFood;
    List<FoodMenu> foodMenuList;
    TextView tvName;
    FoodRecyclerViewAdapter foodRecyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_menu);
        rvFood = findViewById(R.id.rvFood);
//        tvName = findViewById(R.id.tvName);
//
//        Intent intent = getIntent();
//
//        String strName = intent.getStringExtra("Keyname");
//        tvName.setText(strName);

        foodMenuList = new ArrayList<>();
        foodMenuList.add(new FoodMenu(R.drawable.eggsand, "Egg Salad Sandwich", 4, "60.000"));
        foodMenuList.add(new FoodMenu(R.drawable.ham, "Ham & Cheese Sandwich", 5, "65.000"));
        foodMenuList.add(new FoodMenu(R.drawable.chicken, "Chicken Salad Sandwich", 4, "75.000"));
        foodMenuList.add(new FoodMenu(R.drawable.turkey, "French fries & Turkey Sandwich", 4.5F, "70.000"));
        foodMenuList.add(new FoodMenu(R.drawable.beef, "Beef Rib Burger", 5, "80.000"));

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getBaseContext(), 1, RecyclerView.VERTICAL, false);

        foodRecyclerViewAdapter = new FoodRecyclerViewAdapter(foodMenuList);

        rvFood.setLayoutManager(layoutManager);
        rvFood.setAdapter(foodRecyclerViewAdapter);

//        AdapterFood adapterFood = new AdapterFood(foodMenuList);
//        lvFood.setAdapter(adapterFood);
    }
}