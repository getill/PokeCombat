package org.example;
import java.util.Scanner;

public class Combat {
    private Pokemon pokemon1;
    private Pokemon pokemon2;
    private Scanner scanner;

    public Combat(Pokemon pokemon1, Pokemon pokemon2) {
        this.pokemon1 = pokemon1;
        this.pokemon2 = pokemon2;
        this.scanner = new Scanner(System.in);
    }

    private ResultatAttaque calculerDegats(Pokemon defenseur, Attaque attaque) {
        double multiplicateur = 1.0;
        String message = "";

        // Vérification du bonus/malus selon les types
        if ((attaque.getType().equals("Feu") && defenseur.getType().equals("Plante")) ||
                (attaque.getType().equals("Plante") && defenseur.getType().equals("Eau")) ||
                (attaque.getType().equals("Eau") && defenseur.getType().equals("Feu"))) {
            multiplicateur = 2.0;
            message = "C'est super efficace ! ";
        }

        int degats = (int) (attaque.getDegats() * multiplicateur);
        return new ResultatAttaque(degats, message);
    }

    private Attaque choisirAttaque(Pokemon attaquant) {
        System.out.println(attaquant.getName() + ", choisissez une attaque :");

        for (int i = 0; i < attaquant.getAttaques().size(); i++) {
            Attaque attaque = attaquant.getAttaques().get(i);
            System.out.println((i + 1) + ". " + attaque.getNom() + " (" + attaque.getDegats() + " dégâts)");
        }

        int choix;
        do {
            System.out.print("Votre choix : ");
            choix = scanner.nextInt() - 1;
        } while (choix < 0 || choix >= attaquant.getAttaques().size());

        return attaquant.getAttaques().get(choix);
    }

    public void demarrerCombat() {
        System.out.println("Début du combat entre " + pokemon1.getName() + " et " + pokemon2.getName());

        while (pokemon1.getPv() > 0 && pokemon2.getPv() > 0) {
            // Tour du premier Pokémon
            Attaque attaque1 = choisirAttaque(pokemon1);
            ResultatAttaque resultat1 = calculerDegats(pokemon2, attaque1);

            pokemon2.setPv(Math.max(0, pokemon2.getPv() - (resultat1.getDegats() - pokemon2.getDefense())));
            System.out.println(pokemon1.getName() + " utilise " + attaque1.getNom() + " ! " + resultat1.getMessage() + pokemon2.getName() + " a maintenant " + pokemon2.getPv() + " PV.\n");

            if (pokemon2.getPv() == 0) {
                System.out.println(pokemon2.getName() + " est KO ! " + pokemon1.getName() + " gagne !");
                break;
            }

            // Tour du deuxième Pokémon
            Attaque attaque2 = choisirAttaque(pokemon2);
            ResultatAttaque resultat2 = calculerDegats(pokemon1, attaque2);

            pokemon1.setPv(Math.max(0, pokemon1.getPv() - (resultat2.getDegats() - pokemon1.getDefense())));
            System.out.println(pokemon2.getName() + " utilise " + attaque2.getNom() + " ! " + resultat2.getMessage() + pokemon1.getName() + " a maintenant " + pokemon1.getPv() + " PV.\n");

            if (pokemon1.getPv() == 0) {
                System.out.println(pokemon1.getName() + " est KO ! " + pokemon2.getName() + " gagne !");
                break;
            }
        }

        System.out.println("Le combat est terminé !");
    }


}
