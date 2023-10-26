package com.example.dronetech;

import android.widget.ImageView;

public class Dron {
    int imagen;
    String mensaje;
    String descripcion;

    public Dron(int imagen, String mensaje, String descripcion) {
        this.imagen = imagen;
        this.mensaje = mensaje;
        this.descripcion = descripcion;
    }
}