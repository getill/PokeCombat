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

    private ResultatAttaque calculerDegats(Pokemon attaquant, Pokemon defenseur, int baseDommages) {
        double multiplicateur = 1.0;
        String message = "";

        // Vérification des bonus/malus selon les types
        if ((attaquant.getType().equals("Feu") && defenseur.getType().equals("Plante")) ||
                (attaquant.getType().equals("Plante") && defenseur.getType().equals("Eau")) ||
                (attaquant.getType().equals("Eau") && defenseur.getType().equals("Feu"))) {
            multiplicateur = 2.0;
            message = "et c'est super efficace ! "; // Message spécial
        }

        int degats = (int) (baseDommages * multiplicateur);
        return new ResultatAttaque(degats, message);
    }



    public void demarrerCombat() {
        System.out.println("Début du combat entre " + pokemon1.getName() + " et " + pokemon2.getName());

        while (pokemon1.getPv() > 0 && pokemon2.getPv() > 0) {

            // Calcul des dégâts
            ResultatAttaque attaque1 = calculerDegats(pokemon1, pokemon2, 50);
            ResultatAttaque attaque2 = calculerDegats(pokemon2, pokemon1, 50);

            // Simulation d'attaque : chaque attaque enlève 50 PV
            pokemon2.setPv(Math.max(0, pokemon2.getPv() -  (attaque1.getDegats() - pokemon2.getDefense())));


            if (!attaque1.getMessage().isEmpty()) {
                System.out.println(pokemon1.getName() + " attaque " + attaque1.getMessage() + pokemon2.getName() + " a maintenant " + pokemon2.getPv() + " PV.");
            } else {
                System.out.println(pokemon1.getName() + " attaque ! " + pokemon2.getName() + " a maintenant " + pokemon2.getPv() + " PV.");

            }

            if (pokemon2.getPv() == 0) {
                System.out.println(pokemon2.getName() + " est KO ! " + pokemon1.getName() + " gagne !");
                break;
            }

            pokemon1.setPv(Math.max(0, pokemon1.getPv() - (attaque2.getDegats() - pokemon1.getDefense())));


            if (!attaque2.getMessage().isEmpty()) {
                System.out.println(pokemon2.getName() + " attaque " + attaque2.getMessage() + pokemon1.getName() + " a maintenant " + pokemon1.getPv() + " PV.");
            } else {
                System.out.println(pokemon2.getName() + " attaque ! " + pokemon1.getName() + " a maintenant " + pokemon1.getPv() + " PV.");

            }

            if (pokemon1.getPv() == 0) {
                System.out.println(pokemon1.getName() + " est KO ! " + pokemon2.getName() + " gagne !");
                break;
            }
        }

        System.out.println("Le combat est terminé !");
    }
}
