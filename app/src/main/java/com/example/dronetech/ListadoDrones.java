package com.example.dronetech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.widget.ImageView;

public class ListadoDrones extends AppCompatActivity {
    ImageView octocoptero;
    ImageView tricoptero;
    ImageView cuadricoptero;
    ImageView hexacoptero;
    private void changeView(Class clase){
        Intent intent = new Intent(getApplicationContext(), clase);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado_drones);

        octocoptero = findViewById(R.id.imgOctocoptero);
        tricoptero = findViewById(R.id.imgTricoptero);
        cuadricoptero = findViewById(R.id.imgCuadricoptero);
        hexacoptero = findViewById(R.id.imgHexacoptero);

        //TODO: cambiar las vistas cuando las tenga personalizadas
        octocoptero.setOnClickListener(view -> changeView(MainActivity.class));
        tricoptero.setOnClickListener(view -> changeView(MainActivity.class));
        cuadricoptero.setOnClickListener(view -> changeView(MainActivity.class));
        hexacoptero.setOnClickListener(view -> changeView(MainActivity.class));
    }
}