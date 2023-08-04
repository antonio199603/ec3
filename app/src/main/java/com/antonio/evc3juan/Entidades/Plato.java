package com.antonio.evc3juan.Entidades;

public class Plato {

    private int codplato;
    private String nomplato;
    private double precioplato;


    public Plato() {
    }

    public Plato(int codplato, String nomplato, double precioplato) {
        this.codplato = codplato;
        this.nomplato = nomplato;
        this.precioplato = precioplato;
    }

    public int getCodplato() {
        return codplato;
    }

    public void setCodplato(int codplato) {
        this.codplato = codplato;
    }

    public String getNomplato() {
        return nomplato;
    }

    public void setNomplato(String nomplato) {
        this.nomplato = nomplato;
    }

    public double getPrecioplato() {
        return precioplato;
    }

    public void setPrecioplato(double precioplato) {
        this.precioplato = precioplato;
    }

}
