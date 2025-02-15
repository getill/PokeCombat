package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Création des attaques
        Attaque eclair = new Attaque("Éclair", 50, "Électrique");
        Attaque tonnerre = new Attaque("Tonnerre", 60, "Électrique");

        Attaque flamèche = new Attaque("Flammèche", 50, "Feu");
        Attaque lanceFlammes = new Attaque("Lance-Flammes", 70, "Feu");

        // Création d'un Pokémon avec un constructeur complet
        Pokemon Pikachu = new Pokemon("Pikachu", "Électrique", 100, 50, Arrays.asList(eclair, tonnerre));
        Pokemon Salamèche = new Pokemon("Salamèche", "Feu", 110, 45, Arrays.asList(flamèche, lanceFlammes));
        Pokemon Bulbizarre = new Pokemon("Bulbizarre", "Plante", 110, 45, Arrays.asList(flamèche, lanceFlammes));

        // Démarrer le combat
        Combat combat = new Combat(Bulbizarre, Salamèche);

        // Simuler un tour
        combat.demarrerCombat();


    }
}
