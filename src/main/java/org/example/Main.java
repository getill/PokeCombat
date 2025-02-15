package org.example;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Affichage du logo Pokémon en ASCII
        afficherLogoPokemon();

        while (true) {
            System.out.println("\n=== Menu Principal ===");
            System.out.println("1. Choisir un Pokémon et combattre");
            System.out.println("2. Quitter");
            System.out.print("Votre choix : ");

            int choix = scanner.nextInt();
            scanner.nextLine(); // Consommer l’entrée

            if (choix == 1) {
                // Sélection des Pokémon par les joueurs
                System.out.println("\nChoisissez votre Pokémon :");
                for (int i = 0; i < ListPokemon.pokemonsDisponibles.size(); i++) {
                    System.out.println((i + 1) + ". " + ListPokemon.pokemonsDisponibles.get(i).getName());
                }

                System.out.print("Joueur 1, choisissez un Pokémon (1-" + ListPokemon.pokemonsDisponibles.size() + ") : ");
                int choix1 = scanner.nextInt() - 1;
                System.out.print("Joueur 2, choisissez un Pokémon (1-" + ListPokemon.pokemonsDisponibles.size() + ") : ");
                int choix2 = scanner.nextInt() - 1;

                if (choix1 >= 0 && choix1 < ListPokemon.pokemonsDisponibles.size() && choix2 >= 0 && choix2 < ListPokemon.pokemonsDisponibles.size()) {
                    Pokemon joueur1Pokemon = ListPokemon.pokemonsDisponibles.get(choix1);
                    Pokemon joueur2Pokemon = ListPokemon.pokemonsDisponibles.get(choix2);

                    System.out.println("\nLe combat commence entre " + joueur1Pokemon.getName() + " et " + joueur2Pokemon.getName() + " !");

                    // Lancer le combat
                    Combat combat = new Combat(joueur1Pokemon, joueur2Pokemon);
                    combat.demarrerCombat();
                } else {
                    System.out.println("Sélection invalide. Veuillez recommencer.");
                }

            } else if (choix == 2) {
                System.out.println("Merci d'avoir joué !");
                break;
            } else {
                System.out.println("Choix invalide, veuillez entrer 1 ou 2.");
            }
        }

        scanner.close();
    }
    public static void afficherLogoPokemon() {
        System.out.println(""
                + "██████╗  ██████╗ ██╗  ██╗ ██████╗ ███████╗███╗   ███╗ █████╗ ███╗   ██╗\n"
                + "██╔══██╗██╔═══██╗██║  ██║██╔════╝ ██╔════╝████╗ ████║██╔══██╗████╗  ██║\n"
                + "██████╔╝██║   ██║███████║██║  ███╗█████╗  ██╔████╔██║███████║██╔██╗ ██║\n"
                + "██╔═══╝ ██║   ██║██╔══██║██║   ██║██╔══╝  ██║╚██╔╝██║██╔══██║██║╚██╗██║\n"
                + "██║     ╚██████╔╝██║  ██║╚██████╔╝███████╗██║ ╚═╝ ██║██║  ██║██║ ╚████║\n"
                + "╚═╝      ╚═════╝ ╚═╝  ╚═╝ ╚═════╝ ╚══════╝╚═╝     ╚═╝╚═╝  ╚═╝╚═╝  ╚═══╝\n"



        );
    }
}
