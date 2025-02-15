package org.example;
public class Pokemon {
    private String name;
    private String type;
    private int pv;
    private int attaque;
    private int defense;

    public Pokemon(String name, String type, int pv, int attaque, int defense) {
        this.name = name;
        this.type = type;
        this.pv = pv;
        this.attaque = attaque;
        this.defense = defense;
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

    public int getAttaque() {
        return attaque;
    }

    public int getDefense() {
        return defense;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    @Override
    public String toString() {
        return "Pokemon{name='" + name + "', type='" + type + "', pv=" + pv +
                ", attaque=" + attaque + ", defense=" + defense + "}";
    }
}
