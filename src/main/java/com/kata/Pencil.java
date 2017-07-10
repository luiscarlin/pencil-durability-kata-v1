package com.kata;

public class Pencil {
    private String text = "";

    public Pencil(int i) {
    }

    public void write(String text) {
        this.text += text;
    }

    public String getText() {
        return text;
    }

    public int getDurability() {
        return 1;
    }
}
