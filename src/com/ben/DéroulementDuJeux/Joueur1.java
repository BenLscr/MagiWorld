package com.ben.DéroulementDuJeux;

public class Joueur1 {

    public static void displayAvailablePersonnage() {
        System.out.println("Création du personnage du joueur 1");
        System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 Mage)");
    }

    public String choixDuJoueur1() {
        int nbPersonnage = askPersonnage();
        int nbNiveau = -1;
        int nbForce = -1;
        int nbAgilite = -1;
        int nbIntelligence = -1;
        switch (nbPersonnage) {
            case 1 :
                nbNiveau = askNiveau();
                nbForce = askForce();
                nbAgilite = askAgilite();
                nbIntelligence = askIntelligence();
                break;
            case 2 :
                nbNiveau = askNiveau();
                nbForce = askForce();
                nbAgilite = askAgilite();
                nbIntelligence = askIntelligence();
                break;
            case 3 :
                nbNiveau = askNiveau();
                nbForce = askForce();
                nbAgilite = askAgilite();
                nbIntelligence = askIntelligence();
                break;
        }
        return ecrireLapetitephrasequiestdansleterminal;
    }

    public int askPersonnage() {
        String[] personnages = {"Guerrier", "Rôdeur", "Mage"};
        return nbPersonnage;
    }

}
