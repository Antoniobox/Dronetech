package com.example.dronetech;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class info_drones extends AppCompatActivity {
    ImageView imagenDron;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_drones);
        imagenDron = findViewById(R.id.imgInfoDron);
        String data = getIntent().getExtras().getString("num_dron");
        Toast.makeText(this, data, Toast.LENGTH_LONG).show();
        imagenDron.setBackgroundResource(R.drawable.dron1);
    }
}