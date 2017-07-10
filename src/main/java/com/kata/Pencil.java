package com.kata;

public class Pencil {
    private String text = "";

    public void write(String text) {
        this.text += text;
    }

    public String getText() {
        return text;
    }
}
