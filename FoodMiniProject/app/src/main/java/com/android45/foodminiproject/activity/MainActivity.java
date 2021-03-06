package com.android45.foodminiproject.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android45.foodminiproject.R;
import com.android45.foodminiproject.activity.RecyclerViewActivity;

public class MainActivity extends AppCompatActivity {
    TextView tvName;
    EditText etUsername;
    Button btnLogIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvName = findViewById(R.id.tvName);
        etUsername = findViewById(R.id.etUsername);
        btnLogIn = findViewById(R.id.btnLogIn);

        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), RecyclerViewActivity.class);
                String strUsername = etUsername.getText().toString();
                intent.putExtra("Keyname", strUsername);
                startActivity(intent);
            }
        });

    }
}