package org.gpmrks.Teste4;

public class Faturamento {

    private String estado;
    private double faturamento;

    public Faturamento() {
    }

    public Faturamento(String estado, double faturamento) {
        this.estado = estado;
        this.faturamento = faturamento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(double faturamento) {
        this.faturamento = faturamento;
    }

    @Override
    public String toString() {
        return "Faturamento{" +
                "estado='" + estado + '\'' +
                ", faturamento=" + faturamento +
                '}';
    }
}
