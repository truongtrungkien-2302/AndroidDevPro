package com.android45.foodminiproject.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.android45.foodminiproject.R;
import com.android45.foodminiproject.adapter.CartAdapter;
import com.android45.foodminiproject.model.AddToCart;
import com.android45.foodminiproject.model.FoodMenu;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class CartActivity extends AppCompatActivity {
    ImageView imgFood;
    TextView tvFood, tvPrice, tvCart, tvOrderTotal;
    Button btPlaceOrder;
    Spinner quantitySpinner;
    CartAdapter cartAdapter;
    int image = 0;
    String name = "";
    String money = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
//        totalMoney();
        findID();
        clickPlaceOrder();
//        getInfor();
//        catchEvenSpinner();
    }

    private void catchEvenSpinner() {
        Integer[] quantity = new Integer[]{1, 2, 3, 4, 5, 6 ,7 , 8, 9, 10};
        ArrayAdapter<Integer> integerArrayAdapter = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_dropdown_item, quantity);
        quantitySpinner.setAdapter(integerArrayAdapter);

    }

    private void totalMoney() {
        int quantity = Integer.parseInt(tvCart.getText().toString());

    }

    private void findID() {
        imgFood = findViewById(R.id.imgFood);
        tvFood = findViewById(R.id.tvFood);
        tvPrice = findViewById(R.id.tvPrice);
        quantitySpinner = findViewById(R.id.quantitySpinner);
        tvOrderTotal = findViewById(R.id.tvOrderTotal);
        btPlaceOrder = findViewById(R.id.btPlaceOrder);
//        cartAdapter = new CartAdapter(CartActivity.this, RecyclerViewActivity.addToCartList);
    }

    private void clickPlaceOrder() {

        btPlaceOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "Thanks for your order!", Toast.LENGTH_LONG).show();
                int quantity = Integer.parseInt(quantitySpinner.getSelectedItem().toString());
    long newPrice = (long) (quantity * Double.parseDouble(money));
//    RecyclerViewActivity.
            }
        });
    }

}