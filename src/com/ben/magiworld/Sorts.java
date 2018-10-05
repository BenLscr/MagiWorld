package com.ben.magiworld;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Sorts {
    Scanner sc = new Scanner(System.in);
    private int nbSort;
    private int attBasique;
    private double attSpeciale;

   // public Sorts(int attBasique) {
   //     this.attBasique = attBasique;
}

    public void setNbSort(int nbSort) {
        Map<String, Integer> sorts = new HashMap<>();
        sorts.put("Attaque Basique", 1);
        sorts.put("Attaque Spéciale", 2);
        do {
            nbSort = sc.nextInt();
        } while (nbSort != 1 || nbSort != 2);
    }

    public int getNbSort() {
        return nbSort;
    }
}
