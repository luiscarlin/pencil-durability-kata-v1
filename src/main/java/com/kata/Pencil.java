package com.kata;

public class Pencil {
    private String text = "";
    private int durability;

    public Pencil(int durability) {
        this.durability = durability;
    }

    public void write(String text) {
        this.text += text;

        if (!text.equals(" ")) {
            durability -= text.length();
        }
    }

    public String getText() {
        return text;
    }

    public int getDurability() {
        return durability;
    }
}
