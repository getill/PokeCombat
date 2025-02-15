package org.example;

import java.util.Arrays;
import java.util.List;

public class ListPokemon {
    public static List<Pokemon> pokemonsDisponibles = Arrays.asList(
            new Pokemon("Salamèche", "Feu", 110, 45, Arrays.asList(
                    new Attaque("Flammèche", 50, "Feu"),
                    new Attaque("Lance-Flammes", 100, "Feu")
            )),
            new Pokemon("Carapuce", "Eau", 120, 55, Arrays.asList(
                    new Attaque("Pistolet à Eau", 50, "Eau"),
                    new Attaque("Hydrocanon", 60, "Eau")
            )),
            new Pokemon("Pikachu", "Électrique", 100, 50, Arrays.asList(
                    new Attaque("Éclair", 50, "Électrique"),
                    new Attaque("Tonnerre", 60, "Électrique")
            )),
            new Pokemon("Bulbizarre", "Plante", 115, 50, Arrays.asList(
                    new Attaque("Fouet Lianes", 50, "Plante"),
                    new Attaque("Tempête Florale", 70, "Plante")
            )),
            new Pokemon("Racaillou", "Roche", 130, 60, Arrays.asList(
                    new Attaque("Jet-Pierres", 50, "Roche"),
                    new Attaque("Éboulement", 60, "Roche")
            )),
            new Pokemon("Nosferapti", "Poison/Vol", 95, 40, Arrays.asList(
                    new Attaque("Ultrason", 50, "Normal"),
                    new Attaque("Morsure", 65, "Ténèbres")
            ))
    );
}

