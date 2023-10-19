package com.camilomorales.app;

import com.camilomorales.dominio.Celular;
import com.camilomorales.dominio.Smartphone;

public class Main {
    public static void main(String[] args) {
        //Smartphone smartphone = new Smartphone("Apple", "iPhone 12", "iOS");
        Celular celular = new Celular("Huawei","Nova 10");
        Smartphone smartphone = new Smartphone("Apple", "iphone 13","iOS");

        // Acceso a los datos de celular y smartphone
        System.out.println("Celular: " + celular.getMarca() + ", Modelo: " + celular.getModelo());
        System.out.println("Smartphone: " + smartphone.getMarca() + ", Modelo: " + smartphone.getModelo() + ", Sistema Operativo: " + smartphone.getSistemaOperativo());
    }
}

