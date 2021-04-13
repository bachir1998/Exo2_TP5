package com.example.exo2_tp5;

public class Data
{
    private int image;
    private String nom;
    private int taille;

    public Data(int image, String nom, int taille) {
        this.image = image;
        this.nom = nom;
        this.taille = taille;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }
}
