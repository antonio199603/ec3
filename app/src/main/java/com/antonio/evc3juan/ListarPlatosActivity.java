package com.antonio.evc3juan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.antonio.evc3juan.Dao.PlatoDAO;
import com.antonio.evc3juan.adapters.PlatosAdapters;

public class ListarPlatosActivity extends AppCompatActivity {

    ListView lvplatos;

    PlatosAdapters adaptador;

    PlatoDAO dao = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_platos);

        lvplatos = findViewById(R.id.lvplatos);
        //
        Mostrar_Platos();
        //
        dao.Cargar_Platos();

        lvplatos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView,
                                    View view,
                                    int position,
                                    long l) {

                Intent i = new Intent(
                        ListarPlatosActivity.this,
                        MenuActivity.class
                );
                //
                i.putExtra("INDICE", position);
                //
                startActivity(i);

            }
        });

    }

    void Mostrar_Platos()
    {

        dao = new PlatoDAO();
        //
        adaptador = new PlatosAdapters(
                ListarPlatosActivity.this,
                R.layout.item_platos,
                dao.ListarPlatos()
        );
        //
        lvplatos.setAdapter(adaptador);
    }

    @Override
    protected void onResume() {
        super.onResume();
        //
        Mostrar_Platos();
    }

}