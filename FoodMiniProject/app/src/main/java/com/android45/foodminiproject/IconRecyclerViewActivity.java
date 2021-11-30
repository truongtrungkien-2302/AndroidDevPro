package com.android45.foodminiproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class IconRecyclerViewActivity extends AppCompatActivity {
    ImageView imgRemove, imgAdd;
    TextView tvCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icon_recycler_view);
        findID();
        removeAndAdd();
    }

    private void removeAndAdd() {
        imgRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "Check", Toast.LENGTH_LONG).show();
            }
        });
    }

    private void findID() {
        imgRemove = findViewById(R.id.imgRemove);
        imgAdd = findViewById(R.id.imgAdd);
        tvCart = findViewById(R.id.tvCart);
    }
}