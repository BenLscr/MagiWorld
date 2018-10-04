package com.ben.DéroulementDuJeux;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Joueur1 {
    Scanner sc = new Scanner(System.in);
    private int nbPersonnage;
    private int nbNiveau;
    private int nbVitalite;
    private int nbForce;
    private int nbAgilite;
    private int nbIntelligence;

    public void choixDuJoueur1() {
        System.out.println("Création du personnage du joueur 1");
        nbPersonnage = setNbPersonnage();
        nbNiveau = setNbNiveau();
        nbVitalite = setNbVitalite();
        nbForce = setNbForce();
        nbAgilite = setNbAgilite();
        nbIntelligence = setNbIntelligence();
        switch (nbPersonnage) {
            case 1 :
                System.out.println("Woarg je suis le Guerrier Joeur 1 niveau " + nbNiveau + "je possède " + nbVitalite +
                ", " + nbForce + "de force, " + nbAgilite + "d'agilité, " + nbIntelligence + "d'intelligence !");
                break;
            case 2 :
                System.out.println("Gnehehe je suis le Rôdeur Joeur 1 niveau " + nbNiveau + "je possède " + nbVitalite +
                ", " + nbForce + "de force, " + nbAgilite + "d'agilité, " + nbIntelligence + "d'intelligence !");
                break;
            case 3 :
                System.out.println("Abracadabra je suis le Mage Joeur 1 niveau " + nbNiveau + "je possède " + nbVitalite +
                ", " + nbForce + "de force, " + nbAgilite + "d'agilité, " + nbIntelligence + "d'intelligence !");
                break;
        }
    }

    public void setNbPersonnage(int nbPersonnage) {
        Map<String, Integer> personnages = new HashMap<>();
        personnages.put("Guerrier", 1);
        personnages.put("Rôdeur", 2);
        personnages.put("Mage", 3);
        do {
            System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 Mage)");
            nbPersonnage = sc.nextInt();
        } while (!(nbPersonnage < 1 && nbPersonnage > 3));
    }

    public void setNbNiveau(int nbNiveau) {
        do {
            System.out.println("Niveau du personnage ?");
            nbNiveau = sc.nextInt();
        } while (!(nbNiveau > 0 && nbNiveau <= 100));
    }

    public void setNbVitalite(int nbVitalite) {
        this.nbVitalite = nbVitalite * 5;
    }

    public void setNbForce(int nbForce) {
        do {
            System.out.println("Force du personnage ?");
            nbForce = sc.nextInt();
        } while (nbForce > nbNiveau);
    }

    public void setNbAgilite(int nbAgilite) {
        do {
            System.out.println("Agilité du personnage ?");
            nbAgilite = sc.nextInt();
        } while (!(nbAgilite <= nbNiveau - nbForce));
    }

    public void setNbIntelligence(int nbIntelligence) {
        do {
            System.out.println("Intelligence du personnage ?");
            nbIntelligence = sc.nextInt();
        } while (nbIntelligence != nbNiveau - (nbForce + nbAgilite));
    }

    public int getNbVitalite() {
        return nbVitalite;
    }
}
