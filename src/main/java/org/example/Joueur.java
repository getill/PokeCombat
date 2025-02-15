package org.example;

public class Joueur {
    private String name;
    private Pokemon chosedPokemon;

    public Joueur(String name, Pokemon chosedPokemon) {
        this.name = name;
        this.chosedPokemon = chosedPokemon;
    }

    public String getName() {
        return name;
    }

    public Pokemon getChosedPokemon() {
        return chosedPokemon;
    }

    @Override
    public String toString() {
        return "Joueur{name='" + name + "', chosenPokemon='" + chosedPokemon.getName() + "'}";
    }
}
