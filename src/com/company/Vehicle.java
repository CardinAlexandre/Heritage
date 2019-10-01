package com.company;

public abstract class Vehicle {
    //attributs
    private String brand;
    private int kilometers;

    //constructeurs
    public Vehicle(String brand, int kilometers) {
        this.brand = brand;
        this.kilometers = kilometers;
    }

    //getters (accesseurs)
    public String getBrand() {
        return brand;
    }
    public int getKilometers() {
        return kilometers;
    }

    //setters (mutateurs)
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    // méthode instanciée
    public abstract String doStuff();
}