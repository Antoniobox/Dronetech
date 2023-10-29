package com.example.dronetech;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class info_drones extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_drones);
        int id_dron = getIntent().getIntExtra("id", -1);
        if(id_dron != -1){
            ImageView iv = findViewById(R.id.imgInfoDron);
            TextView nombre = findViewById(R.id.nombreDron);
            TextView descripcion = findViewById(R.id.descripcionDron);

            //TODO: preguntarle a MariCarmen por que chuchas no se me almacena en un fichero
            ArrayList<Dron> drones = new ArrayList<>();
            drones.add(new Dron(0, R.drawable.dron1, "CUADRICOPTERO", "Yo quiero bailar, toda la noche"));
            drones.add(new Dron(1, R.drawable.dron2, "TRICÓPTERO", "Life's like a road that you travel on"));
            drones.add(new Dron(2, R.drawable.dron3, "HEXACÓPTERO", "Desarrollado por las mejores gallinas de mi corral"));
            drones.add(new Dron(3, R.drawable.dron4, "OCTOCÓPTERO", "Loreall Paris, por que tu lo vales"));
            Dron dron = drones.get(id_dron);
            iv.setImageResource(dron.imagen);
            nombre.setText(dron.mensaje);
            descripcion.setText(dron.descripcion);
        }
    }
}