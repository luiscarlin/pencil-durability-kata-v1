package com.kata;

public class Pencil {
    private String text = "";
    private int durability;

    public Pencil(int durability) {
        this.durability = durability;
    }

    public void write(String text) {
        this.text += text;
        text = text.replace(" ", "");
        text = text.replace("\n", "");

        for (int i = 0; i < text.length(); i++){
            char c = text.charAt(i);

            if (Character.isUpperCase(c)) {
                durability -= 2;
            }
            else {
                durability -= 1;
            }
        }
    }

    public String getText() {
        return text;
    }

    public int getDurability() {
        return durability;
    }
}
