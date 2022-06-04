package com.company;
import java.util.*;

public class Elixir {
    private String name;
    private boolean isCreated;
    private int power;
    private List<Ingredient> ingredients;
    private Liquid catalyst;

    public Elixir(String name) {
        this.name = name;
        isCreated = false;
        ingredients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public boolean isCreated() {
        return isCreated;
    }

    public int getPower() {
        return power;
    }

    public Liquid getCatalyst() {
        return catalyst;
    }

    public void addIngredient(Ingredient ingredient) {
        if (isCreated) {
            System.out.println("The ingredient cannot be added");
        } else {
            ingredients.add(ingredient);
        }
    }

    public void removeIngredient(Ingredient ingredient) {
        if (isCreated) {
            System.out.println("The ingredient cannot be removed");
        } else {
            ingredients.remove(ingredient);
        }
    }

    public void create() {
        isCreated = true;
    }
}

