package org.example;

public class Attaque {
    private String nom;
    private int degats;
    private String type;

    public Attaque(String nom, int degats, String type) {
        this.nom = nom;
        this.degats = degats;
        this.type = type;
    }

    public String getNom() {
        return nom;
    }

    public int getDegats() {
        return degats;
    }

    public String getType() {
        return type;
    }
}
