package com.antonio.evc3juan.Dao;

import com.antonio.evc3juan.Entidades.Plato;

import java.util.ArrayList;
import java.util.List;

public class PlatoDAO {

    private static List<Plato> lista = new ArrayList<>();

    public List<Plato> ListarPlatos(){

        return lista;
    }

    public void Cargar_Platos()
    {

        lista.add(new Plato(1001, "Rocotos", 12.0));
        lista.add(new Plato(1002, "Aji de Gallina", 20.0));
        lista.add(new Plato(1003, "Anticuchos", 13.0));
        lista.add(new Plato(1004, "Mariscos", 25.0));
        lista.add(new Plato(1005, "Avas", 30.0));
        lista.add(new Plato(1006, "Cheviche", 50.0));

    }

}
