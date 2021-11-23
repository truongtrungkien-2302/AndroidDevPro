package com.android45.btvnlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvFood;
    ArrayList<Menu> menuArrayList;
    Menu menu1, menu2, menu3, menu4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvFood = findViewById(R.id.lvFood);
        menuArrayList = new ArrayList<>();

        menuArrayList.add(new Menu(true, "Món Huế", 3, 52, "Phở-Mì-Bún", "Miễn phí", 45, "50000đ"));
        menuArrayList.add(new Menu(true, "Joma Bakery Cafe", 5, 405, "Bánh ngọt, Salad, Sandwich", "Miễn phí", 40, "200000đ"));
        menuArrayList.add(new Menu(true, "Doner Kebab 1995", 0, 0, "Phở-Mì-Bún", "35000", 30, "60000đ"));
        menuArrayList.add(new Menu(true, "Cơm Đại Vương - Cơm Đài Loan", 0, 0, "Cơm, Món châu Á khác", "50000đ", 30, ""));

        AdapterFood adapterFood = new AdapterFood(menuArrayList);

        lvFood.setAdapter(adapterFood);
    }
}