package com.example.cadastroderoupa.controller;

import com.example.cadastroderoupa.module.Roupa;

import java.util.ArrayList;
import java.util.List;

public class RoupaDAO {

    private static List<Roupa>  listaRoupas = new ArrayList<>();

    public void addRoupa(Roupa r) {listaRoupas.add(r);}

    public Roupa getRoupa(int position) {return listaRoupas.get(position);}

    public List<Roupa> getListaRoupas() {return listaRoupas;}
}
