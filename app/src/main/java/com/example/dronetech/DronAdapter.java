package com.example.dronetech;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class DronAdapter extends ArrayAdapter<Dron> {
    public DronAdapter(@NonNull Context context, ArrayList<Dron> drones) {
        super(context, 0, drones);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Dron dron = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_dron, parent, false);
        }
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), info_drones.class);
                intent.putExtra("id", dron.id);
                getContext().startActivity(intent);
            }
        });
        TextView nombreTextView = convertView.findViewById(R.id.nombreTextView);
        TextView descripcionTextView = convertView.findViewById(R.id.descripcionTextView);
        ImageView imagenImageView = convertView.findViewById(R.id.imagenImageView);

        nombreTextView.setText(dron.mensaje);
        descripcionTextView.setText(dron.descripcion);
        imagenImageView.setImageResource(dron.imagen);

        return convertView;
    }
}
