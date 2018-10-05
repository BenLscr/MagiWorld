package com.ben.magiworld;

import java.util.Scanner;

public class Partie {
    Scanner sc = new Scanner(System.in);
    private Joueur1 joueur1;
    private Joueur2 joueur2;
    private Sorts sorts;

    public void initJoueurs() {
        Joueur1 premierJoueur = new Joueur1();
        Joueur1.choixDuJoueur1();
        Joueur2 secondJoueur = new Joueur2();
        Joueur2.choixDuJoueur2();
    }

    public void nouvellePartie() {
        do {
            if (joueur2.getNbVitalite() > 0) {
                System.out.println("Joueur 1 (" + joueur1.getNbVitalite() + " veuillez choisir votre action (1 :" +
                        " Attaque Basique, 2 : Attaque Spéciale)");
                sorts.getNbSort();
                System.out.println("Joueur 1 utilise " + nomducouuuuup + "et inflige " + nombrededommages + " dommages.");
                System.out.println("Joueur 2 perd" + nombrededommages + "points de vie");
                joueur2.getNbVitalite() = joueur2.getNbVitalite() - nombrededommages;
            } else {
                System.out.println("Joueur 2 est mort");
                System.out.println("Joueur 2 a perdu !");
            }
            if (joueur1.getNbVitalite() > 0) {
                System.out.println("Joueur 2 (" + joueur1.getNbVitalite() + " veuillez choisir votre action (1 :" +
                        " Attaque Basique, 2 : Attaque Spéciale)");
                sorts.getNbSort();
                System.out.println("Joueur 2 utilise " + nomducouuuuup + "et inflige " + nombrededommages + " dommages.");
                System.out.println("Joueur 1 perd" + nombrededommages + "points de vie");
                joueur2.getNbVitalite() = joueur2.getNbVitalite() - nombrededommages;
            } else {
                System.out.println("Joueur 1 est mort");
                System.out.println("Joueur 1 a perdu !");
            }
        } while (joueur1.getNbVitalite() != 0 || joueur2.getNbVitalite != 0 );
    }
}
