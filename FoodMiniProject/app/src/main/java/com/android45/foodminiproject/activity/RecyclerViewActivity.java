package com.android45.foodminiproject.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.android45.foodminiproject.Interface.IconClickFoodRecyclerView;
import com.android45.foodminiproject.model.AddToCart;
import com.android45.foodminiproject.model.FoodMenu;
import com.android45.foodminiproject.adapter.FoodRecyclerViewAdapter;
import com.android45.foodminiproject.R;

import java.text.DecimalFormat;
import java.util.*;

public class RecyclerViewActivity extends AppCompatActivity {
    RecyclerView rvFood;
    List<FoodMenu> foodMenuList;
    List<AddToCart> addToCartList;
    FoodRecyclerViewAdapter foodRecyclerViewAdapter;
    ImageView imgFood;
    Spinner quantitySpinner;
    TextView tvName, tvPrice;
    ImageView imgCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        findID();
        addRecyclerView();
        getName();
        clickImgCart();
        addCart();
//        addQuantitySpinner();
    }

    private void addQuantitySpinner() {
        Integer[] quantity = new Integer[]{1, 2, 3, 4, 5, 6 ,7 , 8, 9, 10};
        ArrayAdapter<Integer> integerArrayAdapter = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_dropdown_item, quantity);
        quantitySpinner.setAdapter(integerArrayAdapter);
    }

    private void addCart() {
        if (addToCartList != null) {

        } else {
            addToCartList = new ArrayList<>();
        }
    }


    private void clickImgCart() {
        imgCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getBaseContext(), CartActivity.class);
//                Bundle bundle = new Bundle();
//                String[] nameFood = new String[foodMenuList.size()];
//                String[] priceFood = new String[foodMenuList.size()];
////                int[] product = new int[foodMenuList.size()];
//                int[] imageFood = new int[foodMenuList.size()];
//                for (int i = 0; i < foodMenuList.size(); i++) {
//                    nameFood[i] = foodMenuList.get(i).getTvFood();
//                    priceFood[i] = foodMenuList.get(i).getTvPrice();
//                    imageFood[i] = foodMenuList.get(i).getImgFood();
//                }
//                bundle.putIntArray("imgFood", imageFood);
//                bundle.putStringArray("nameFood", nameFood);
//                bundle.putStringArray("priceFood", priceFood);
//                bundle.putString("totalMoney", tvPrice.getText().toString());
//                intent1.putExtra("data", bundle);
                startActivity(intent1);
            }
        });
    }

    private void getName() {
        Intent intent = getIntent();
        String strName = intent.getStringExtra("Keyname");
        tvName.setText(strName);
    }

    private void findID() {
        imgFood = findViewById(R.id.imgFood);
        rvFood = findViewById(R.id.rvMenu);
        tvName = findViewById(R.id.tvName);
        tvPrice = findViewById(R.id.tvPrice);
        quantitySpinner = findViewById(R.id.quantitySpinner);
        imgCart = findViewById(R.id.imgCart);
    }

    private void addRecyclerView() {
        foodMenuList = new ArrayList<>();
        foodMenuList.add(new FoodMenu(R.drawable.eggsand, "Egg Salad Sandwich", 4, "60.000"));
        foodMenuList.add(new FoodMenu(R.drawable.ham, "Ham & Cheese Sandwich", 5, "65.000"));
        foodMenuList.add(new FoodMenu(R.drawable.chicken, "Chicken Salad Sandwich", 4, "75.000"));
        foodMenuList.add(new FoodMenu(R.drawable.turkey, "French fries & Turkey Sandwich", 4.5F, "70.000"));
        foodMenuList.add(new FoodMenu(R.drawable.beef, "Beef Rib Burger", 5, "80.000"));
        foodMenuList.add(new FoodMenu(R.drawable.fries, "Fries and BBQ sauce", 4.5F, "60.000"));
        foodMenuList.add(new FoodMenu(R.drawable.fries, "Fries and BBQ sauce", 4.5F, "60.000"));

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getBaseContext(), 1, RecyclerView.VERTICAL, false);

        foodRecyclerViewAdapter = new FoodRecyclerViewAdapter(foodMenuList);
        rvFood.setLayoutManager(layoutManager);
        rvFood.setAdapter(foodRecyclerViewAdapter);

        foodRecyclerViewAdapter.setIconClickFoodRecyclerView(new IconClickFoodRecyclerView() {
            @Override
            public void onClickAddToCart(FoodMenu foodMenu) {
                Toast.makeText(getBaseContext(), foodMenu.getTvFood() + "Added To Cart", Toast.LENGTH_LONG).show();
//                getInfor();
            }

            @Override
            public void onClickItem(FoodRecyclerViewAdapter foodRecyclerViewAdapter, View view, int quantity, long l) {
                Intent intent = new Intent(getBaseContext(), CartActivity.class);
                intent.putExtra("productInfor", foodMenuList.get(quantity));
                startActivity(intent);
            }
        });

        if (addToCartList != null) {

        } else {
            addToCartList = new ArrayList<>();
        }
    }

    private void getInfor() {
        int image = 0;
        String name = "";
        String money = "";
        FoodMenu foodMenu = (FoodMenu) getIntent().getSerializableExtra("productInfor");
        image = foodMenu.getImgFood();
        name = foodMenu.getTvFood();
        money = foodMenu.getTvPrice();
        imgFood.setImageResource(image);
        tvName.setText(name);
        DecimalFormat decimalFormat = new DecimalFormat("###.###.###");
        tvPrice.setText("Giá: " + decimalFormat.format(String.valueOf(money)) + "VNĐ");
    }
}