package com.camilomorales.dominio;

public class Smartphone extends Celular {
    private String sistemaOperativo;

    public Smartphone(String marca, String modelo, String sistemaOperativo) {
        super(marca, modelo);
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }
}

