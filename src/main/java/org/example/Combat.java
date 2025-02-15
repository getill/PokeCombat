package org.example;

public class Combat {
    private Pokemon pokemon1; // Stocke le Pokémon qui participe au combat
    private Pokemon pokemon2; // Stocke le Pokémon qui participe au combat

    public Combat(Pokemon pokemon1, Pokemon pokemon2) {
        this.pokemon1 = pokemon1;
        this.pokemon2 = pokemon2;
    }

    public void afficherPv() {
        System.out.println(pokemon1.getName() + " a " + pokemon1.getPv() + " PV.");
        System.out.println(pokemon2.getName() + " a " + pokemon2.getPv() + " PV.");
    }

    public void demarrerCombat() {
        System.out.println("Début du combat entre " + pokemon1.getName() + " et " + pokemon2.getName());

        while (pokemon1.getPv() > 0 && pokemon2.getPv() > 0) {
            // Simulation d'attaque : chaque attaque enlève 50 PV
            pokemon2.setPv(Math.max(0, pokemon2.getPv() -  (50 - pokemon2.getDefense())));
            System.out.println(pokemon1.getName() + " attaque ! " + pokemon2.getName() + " a maintenant " + pokemon2.getPv() + " PV.");

            if (pokemon2.getPv() == 0) {
                System.out.println(pokemon2.getName() + " est KO ! " + pokemon1.getName() + " gagne !");
                break;
            }

            pokemon1.setPv(Math.max(0, pokemon1.getPv() - (50 - pokemon1.getDefense())));
            System.out.println(pokemon2.getName() + " attaque ! " + pokemon1.getName() + " a maintenant " + pokemon1.getPv() + " PV.");

            if (pokemon1.getPv() == 0) {
                System.out.println(pokemon1.getName() + " est KO ! " + pokemon2.getName() + " gagne !");
                break;
            }
        }

        System.out.println("Le combat est terminé !");
    }
}
