package com.ben.Personnage;

public class Personnage {
    private String name;
    private int niveau;
    private int vie;
    private int force;
    private int agilite;
    private int intelligence;

    public Personnage(String name, int niveau, int vie, int force, int agilite, int intelligence) {}

    public String getName() {
        return name;
    }

    public int getNiveau() {
        return niveau;
    }

    public int getVie() {
        return vie;
    }

    public int getForce() {
        return force;
    }

    public int getAgilite() {
        return agilite;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public void setAgilite(int agilite) {
        this.agilite = agilite;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
}
