package com.android45.foodminiproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.*;

public class RecyclerViewActivity extends AppCompatActivity {
    RecyclerView rvFood;
    List<FoodMenu> foodMenuList;
    FoodRecyclerViewAdapter foodRecyclerViewAdapter;
    TextView tvName, tvCart, tvMoney;
    ImageView imgRemove, imgAdd;
    Button btOrder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        findID();
        addRecyclerView();
        getName();
//        addAndRemove();
        clickOrder();


    }

    private void addAndRemove() {
        imgAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int addCart = Integer.parseInt(tvCart.getText().toString());
                tvCart.setText(Intent.parseIntent());
            }
        });
    }

    private void getName() {
        Intent intent = getIntent();
        String strName = intent.getStringExtra("Keyname");
        tvName.setText(strName);
    }

    private void clickOrder() {
        btOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "Thank you! Your order is sent to restaurant!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void findID() {
        rvFood = findViewById(R.id.rvMenu);
        tvName = findViewById(R.id.tvName);
        tvCart = findViewById(R.id.tvCart);
        tvMoney = findViewById(R.id.tvMoney);
        imgRemove = findViewById(R.id.imgRemove);
        imgAdd = findViewById(R.id.imgAdd);
        btOrder = findViewById(R.id.btOrder);
    }

    private void addRecyclerView() {
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
    }
}