package org.example;

public class Main {
    public static void main(String[] args) {
        // Création d'un Pokémon avec un constructeur complet
        Pokemon Pikachu = new Pokemon("Pikachu", "Électrique", 100, 50, 30);
        Pokemon Bulbizarre = new Pokemon("Bulbizarre", "Plante", 120, 40, 35);
        Pokemon Salamèche = new Pokemon("Salamèche", "Feu", 110, 45, 25);
        Pokemon Carapuce = new Pokemon("Carapuce", "Eau", 115, 35, 40);
        Pokemon Rondoudou = new Pokemon("Rondoudou", "Normal", 130, 30, 20);

        // Création d'un joueur avec son Pokémon
        Joueur joueur1 = new Joueur("Sacha", Bulbizarre);
        Joueur joueur2 = new Joueur("Test", Carapuce);
        Combat combat = new Combat(Pikachu, Carapuce);

        // Affichage
        System.out.println(Carapuce);
        combat.afficherPv();

        combat.demarrerCombat();


//       System.out.println(joueur1);
//       System.out.println(joueur2);
//
//        // Affichage des valeurs individuelles
//        System.out.println("Nom: " + Pikachu.getName());
//        System.out.println("Type: " + Pikachu.getType());
//        System.out.println("PV: " + Pikachu.getPv());
//        System.out.println("Attaque: " + Pikachu.getAttaque());
//        System.out.println("Défense: " + Pikachu.getDefense());
    }
}
