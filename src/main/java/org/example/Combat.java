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
    public void fireAttack() {
        int newPv = pokemon1.getPv() - 50;
        if (newPv < 0) {
            newPv = 0; // Empêche d'avoir des PV négatifs

        }

        pokemon1.setPv(newPv); // Mise à jour des PV
        System.out.println(pokemon1.getName() + " subit une attaque et a maintenant " + pokemon1.getPv() + " PV.");
    }
}
