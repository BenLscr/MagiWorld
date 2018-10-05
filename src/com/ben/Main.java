package com.ben;

import com.ben.DéroulementDuJeux.Partie;

public class Main {

    public static void main(String[] args) {
        Partie partie = new Partie();
        partie.initJoueurs();
        partie.nouvellePartie();
    }
}
