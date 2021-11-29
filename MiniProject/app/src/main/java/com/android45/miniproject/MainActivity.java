package com.android45.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lvFood;
    List<FoodMenu> foodMenuList;
    FoodMenu foodMenu1, foodMenu2, foodMenu3, foodMenu4, foodMenu5;
    ImageView imgAdd, imgRemove;
    TextView tvCart, tvName;
    EditText etUsername, etPassword;
    Button btnLogIn;
    LinearLayout linearFoodMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvFood = findViewById(R.id.lvFood);
        imgAdd = findViewById(R.id.imgAdd);
        imgRemove = findViewById(R.id.imgRemove);
        tvCart = findViewById(R.id.tvCart);
        tvName = findViewById(R.id.tvName);
        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnLogIn = findViewById(R.id.btnLogIn);
//        linearFoodMenu = findViewById();

        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = etUsername.getText().toString();
                tvName.setText(username);Intent intent = new Intent(getBaseContext(), ActivityFoodMenu.class);
                startActivity(intent);
            }
        });

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