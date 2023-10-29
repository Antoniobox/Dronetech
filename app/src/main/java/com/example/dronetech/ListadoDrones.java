package com.example.dronetech;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListadoDrones extends AppCompatActivity {
    ArrayList<Dron> drones;

    @Override
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado_drones);
        drones = new ArrayList<>();
        drones.add(new Dron(0, R.drawable.dron1, "CUADRICOPTERO", "Yo quiero bailar, toda la noche"));
        drones.add(new Dron(1, R.drawable.dron2, "TRICÓPTERO", "Life's like a road that you travel on"));
        drones.add(new Dron(2, R.drawable.dron3, "HEXACÓPTERO", "Desarrollado por las mejores gallinas de mi corral"));
        drones.add(new Dron(3, R.drawable.dron4, "OCTOCÓPTERO", "Loreall Paris, por que tu lo vales"));
        IODrones.guardarDrones(this.getApplicationContext(), drones, "drones");
        //FIXME: no almacena el fichero :(
        ListView listView = findViewById(R.id.listView);
        DronAdapter dronAdapter = new DronAdapter(this, drones);
        listView.setAdapter(dronAdapter);
    }
}