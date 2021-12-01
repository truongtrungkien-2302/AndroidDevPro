package com.android45.foodminiproject.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.android45.foodminiproject.R;
import com.android45.foodminiproject.model.AddToCart;

import java.util.ArrayList;
import java.util.List;

public class CartActivity extends AppCompatActivity {
    Button btPlaceOrder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        findID();
        clickPlaceOrder();
    }

    private void findID() {
        btPlaceOrder = findViewById(R.id.btPlaceOrder);
    }

    private void clickPlaceOrder() {
        btPlaceOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "Thank you! Your order is sent to restaurant!", Toast.LENGTH_SHORT).show();
            }
        });
    }

}