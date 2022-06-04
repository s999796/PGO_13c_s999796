package com.company;

public class Liquid extends Ingredient {
    private int dissolubility;

    public Liquid(int dissolubility) {
        this.dissolubility = dissolubility;
    }

    public int getDissolubility() {
        return dissolubility;
    }

    public void setDissolubility(int dissolubility) {
        this.dissolubility = dissolubility;
    }

    @Override
    public int getReagent() {
        return baseReagent * (dissolubility / 100);
    }
}
