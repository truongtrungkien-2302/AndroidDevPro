package com.android45.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lvFood;
    List<FoodMenu> foodMenuList;
    FoodMenu foodMenu1, foodMenu2, foodMenu3, foodMenu4, foodMenu5;
    ImageView imgAdd, imgRemove;
    TextView tvCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getUserName();
        addFoodMenuList();
//        foodAddAndRemove();
    }

    private void getUserName() {

    }

    private void addFoodMenuList() {
        lvFood = findViewById(R.id.lvFood);
        foodMenuList = new ArrayList<>();
        foodMenuList.add(new FoodMenu(R.drawable.eggsand, "Egg Salad Sandwich", 4, "60.000"));
        foodMenuList.add(new FoodMenu(R.drawable.ham, "Ham & Cheese Sandwich", 5, "65.000"));
        foodMenuList.add(new FoodMenu(R.drawable.chicken, "Chicken Salad Sandwich", 4, "75.000"));
        foodMenuList.add(new FoodMenu(R.drawable.turkey, "French fries & Turkey Sandwich", 4.5F, "70.000"));
        foodMenuList.add(new FoodMenu(R.drawable.beef, "Beef Rib Burger", 5, "80.000"));

        AdapterFood adapterFood = new AdapterFood(foodMenuList);
        lvFood.setAdapter(adapterFood);
    }

//    private void foodAddAndRemove() {
//        imgAdd = findViewById(R.id.imgAdd);
//        imgRemove = findViewById(R.id.imgRemove);
//        tvCart = findViewById(R.id.tvCart);
//
//        imgAdd.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                tvCart.setText(tvCart.getText().toString() + "1");
//            }
//        });
//    }
}