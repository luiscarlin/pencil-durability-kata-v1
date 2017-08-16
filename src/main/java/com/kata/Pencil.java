package com.kata;

public class Pencil {
    private String text = "";
    private int durability;

    public Pencil(int durability) {
        this.durability = durability;
    }

    public void write(String text) {
        for (char c : text.toCharArray()) {
            if (durability == 0) {
                break;
            }
            if (Character.isWhitespace(c)) {
                this.text += c;
                continue;
            }

            if (Character.isUpperCase(c)) {
                durability -= 2;
            }
            else {
                durability -= 1;
            }

            this.text += c;
        }
    }

    public String getText() {
        return text;
    }

    public int getDurability() {
        return durability;
    }
}
