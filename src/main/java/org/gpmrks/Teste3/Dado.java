package org.gpmrks.Teste3;

public class Dado {

    private int dia;
    private float valor;

    public Dado() {
    }

    public Dado(int dia, float valor) {
        this.dia = dia;
        this.valor = valor;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Dado{" +
                "dia=" + dia +
                ", valor=" + valor +
                '}';
    }
}
