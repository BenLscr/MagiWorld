package com.ben.DéroulementDuJeux;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Joueur1 {
    Scanner sc = new Scanner(System.in);

    public static void displayAvailablePersonnage() {
        System.out.println("Création du personnage du joueur 1");
        System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 Mage)");
    }

    public String choixDuJoueur1() {
        int nbPersonnage = askPersonnage();
        int nbCaract1 = askCaract1();
        switch (nbPersonnage) {
            case 1 :
                nbCaract1 = askCaract1;
                break;
            case 2 :
                nbCaract1 = askCaract1;
                break;
            case 3 :
                nbCaract1 = askCaract1;
                break;
        }
        return ecrireLapetitephrasequiestdansleterminal;
    }


    public int askPersonnage() {
        String[] personnages = {"Guerrier", "Rôdeur", "Mage"};
        return nbPersonnage;
    }


    private int askCaract1() {
        int nbNiveau = 0;
        int nbForce = 0;
        int nbAgilite = 0;
        int nbIntelligence = 0;
        System.out.println("Niveau du personnage ?");
        boolean responseIsGood;
        do {
            nbNiveau = sc.nextInt();
            responseIsGood = (nbNiveau > 0 && nbNiveau <= 100);
        } while (!responseIsGood);

        System.out.println("Force du personnage ?");
        do {
            nbForce = sc.nextInt();
            responseIsGood = (nbForce <= nbNiveau);
            if (responseIsGood) {
                do {
                    System.out.println("Agilité du personnage ?");
                    nbAgilite = sc.nextInt();
                        responseIsGood = (nbAgilite <= nbNiveau - nbForce);
                    if (responseIsGood) {
                        do {
                            System.out.println("Intelligence du personnage ?");
                            nbIntelligence = sc.nextInt();
                            responseIsGood = (nbIntelligence = nbNiveau - (nbForce + nbAgilite));
                            if (responseIsGood) {
                                bonbhalàcestterminé
                            } else {
                                System.out.println("Ton intelligence doit être égal à " + nbNiveau - (nbForce + nbAgilite);
                            }
                        } while (!responseIsGood);
                    } else {
                        System.out.println("Ton agilité doit être inférieur ou égal à " + nbNiveau + nbForce);
                    }
                } while (!responseIsGood);
            } else {
                System.out.println("Ta force doit être inférieur ou égal à " + nbNiveau);
            }
        } while (!responseIsGood);
        return untruc;
    }
}
