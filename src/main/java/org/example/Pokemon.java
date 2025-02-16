package org.example;
import java.util.List;

public class Pokemon {
    private String name;
    private String type;
    private int pv;
    private int defense;
    private List<Attaque> attaques;

    public Pokemon(String name, String type, int pv, int defense, List<Attaque> attaques) {
        this.name = name;
        this.type = type;
        this.pv = pv;
        this.defense = defense;
        this.attaques = attaques;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getPv() {
        return pv;
    }


    public int getDefense() {
        return defense;
    }

    public List<Attaque> getAttaques() {
        return attaques;
    }

    public void setPv(int pv) {
        pv = Math.max(pv,0);
        this.pv = pv;
    }

    @Override
    public String toString() {
        return "Pokemon{name='" + name + "', type='" + type + "', pv=" + pv +
                ", attaque=" + attaques + ", defense=" + defense + "}";
    }
}
