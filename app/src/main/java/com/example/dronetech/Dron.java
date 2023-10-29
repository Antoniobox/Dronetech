package com.example.dronetech;

import android.widget.ImageView;

public class Dron {
    int id;
    int imagen;
    String mensaje;
    String descripcion;

    public Dron(int id, int imagen, String mensaje, String descripcion) {
        this.id = id;
        this.imagen = imagen;
        this.mensaje = mensaje;
        this.descripcion = descripcion;
    }
}