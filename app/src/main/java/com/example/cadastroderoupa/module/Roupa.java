package com.example.cadastroderoupa.module;

public class Roupa {
    private String tipo;
    private String cor;
    private String tamanho;
    private String marca;

    public Roupa() {
    }

    public Roupa(String tipo, String cor, String tamanho, String marca) {
        this.tipo = tipo;
        this.cor = cor;
        this.tamanho = tamanho;
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
