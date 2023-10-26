package com.example.dronetech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.widget.ImageView;

import java.util.List;

public class ListadoDrones extends AppCompatActivity {
    List<Dron> drones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado_drones);
        //TODO: terminar vista dinámica
        drones.add(new Dron(R.drawable.dron1, "CUADRICOPTERO", "Yo quiero bailar, toda la noche"));
        drones.add(new Dron(R.drawable.dron2, "TRICÓPTERO", "Baila baila bailando ba, baila baila bailando eh!"));
        drones.add(new Dron(R.drawable.dron3, "HEXACÓPTERO", "Desarrollado por las mejores gallinas de mi corral"));
        drones.add(new Dron(R.drawable.dron4, "OCTOCÓPTERO", "Loreall Paris, por que tu lo vales"));
    }
}