package com.android45.btvnlistview;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lvFood;
    List<FoodMenu> foodMenuList;
    FoodMenu foodMenu1, foodMenu2, foodMenu3, foodMenu4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvFood = findViewById(R.id.lvFood);

        foodMenuList = new ArrayList<>();

        foodMenuList.add(new FoodMenu(R.drawable.monhue, "Món Huế", 5, "(52)", "Phở-Mì-Bún, Cơm, Ẩm thực miền Bắc", "Miễn phí|", "45min", "Tối thiểu 50.000đ"));
        foodMenuList.add(new FoodMenu(R.drawable.joma, "Joma Bakery Cafe", 5, "(405)", "Bánh ngọt, Salad, Sandwich", "Miễn phí|", "40min", "Tối thiểu 200.000đ"));
        foodMenuList.add(new FoodMenu(R.drawable.donerkebab, "Doner Kebab 1995", 5, "", "Món Thổ Nhĩ Kì, Món châu Á khác", "35.000đ|", "30min", "Tối thiểu 60.000đ"));
        foodMenuList.add(new FoodMenu(R.drawable.com, "Cơm Đại Vương - Cơm Đài Loan", 5, "", "Cơm, Món châu Á khác", "50.000đ|", "30min", ""));

        AdapterFoodMenu adapterFoodMenu = new AdapterFoodMenu(foodMenuList);
        lvFood.setAdapter(adapterFoodMenu);
    }

}