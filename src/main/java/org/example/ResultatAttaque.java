package org.example;

public class ResultatAttaque {
    private int degats;
    private String message;

    public ResultatAttaque(int degats, String message) {
        this.degats = degats;
        this.message = message;
    }

    public int getDegats() {
        return degats;
    }

    public String getMessage() {
        return message;
    }
}
