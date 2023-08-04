package com.antonio.evc3juan.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.antonio.evc3juan.Entidades.Plato;
import com.antonio.evc3juan.R;

import java.util.List;

public class PlatosAdapters  extends ArrayAdapter<Plato> {

    Context micontexto;
    int milayout;
    List<Plato> milista;

    public PlatosAdapters(@NonNull Context context,
                           int resource,
                           @NonNull List<Plato> objects) {
        super(context, resource, objects);

        micontexto = context;
        milayout = resource;
        milista = objects;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        convertView = LayoutInflater.from(micontexto).inflate(milayout, null);
        //
        Plato objPla = milista.get(position);
        //
        TextView tv1 = convertView.findViewById(R.id.tvPLATOFILA1);
        TextView tv2 = convertView.findViewById(R.id.tvPLATOFILA2);
        TextView tv3 = convertView.findViewById(R.id.tvPLATOFILA3);
        //
        ImageView img = convertView.findViewById(R.id.imgIMAGEN);
        //
        tv1.setText(objPla.getNomplato());
        tv2.setText("Precio del Plato: " + objPla.getPrecioplato());
        tv3.setText("Codigo del Plato: " + objPla.getCodplato());
        //
        img.setImageResource(obtener_Id_Imagen(objPla.getCodplato()));
        //
        return convertView;
    }

    int obtener_Id_Imagen(int codigo)
    {
        String nom_imagen = "p" + codigo;
        String recurso = "drawable";
        String paquete = getContext().getPackageName();
        //
        int resultado =
                getContext().getResources()
                        .getIdentifier(nom_imagen, recurso, paquete);
        //
        return resultado;
    }
}
