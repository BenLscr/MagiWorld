package com.ben;

import com.ben.DéroulementDuJeux.Joueur1;
import com.ben.DéroulementDuJeux.Joueur2;
import com.ben.DéroulementDuJeux.Partie;

public class Main {

    public static void main(String[] args) {
        Joueur1 premierJoueur = new Joueur1();
        Joueur1.choixDuJoueur1();
        Joueur2 secondJoueur = new Joueur2();
        Joueur2.choixDuJoueur2();
        Partie nouvellePartie = new Partie();
    }
}
