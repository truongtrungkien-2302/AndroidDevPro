package com.android45.foodminiproject.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android45.foodminiproject.R;
import com.android45.foodminiproject.model.AddToCart;

import java.util.ArrayList;
import java.util.List;

public class CartActivity extends AppCompatActivity {
    List<>
    ImageView imgRemove, imgAdd;
    TextView tvCart, tvOrderTotal;
    Button btPlaceOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        totalMoney();
        findID();
        clickPlaceOrder();
    }

    private void totalMoney() {
        int quantity = Integer.parseInt(tvCart.getText().toString());

    }

    private void findID() {
        imgRemove = findViewById(R.id.imgRemove);
        imgAdd = findViewById(R.id.imgAdd);
        tvCart = findViewById(R.id.tvCart);
        tvOrderTotal = findViewById(R.id.tvOrderTotal);
        btPlaceOrder = findViewById(R.id.btPlaceOrder);
    }

    private void clickPlaceOrder() {

        btPlaceOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "Thanks for your order!", Toast.LENGTH_LONG).show();
            }
        });
    }

}