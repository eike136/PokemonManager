package de.uhd.ifi.pokemonmanager;

import java.util.ArrayList;

public class Pokemon {

    private String name;
    private Type type;
    private int number;
    private static int nextNumber;
    private String Trainer = "frei";
    public static ArrayList<Pokemon> pokemon_list = new ArrayList<Pokemon>();

    public Pokemon(String name, Type type) {
        this.name = name;
        this.type = type;
        this.number = nextNumber;
        nextNumber++;
        pokemon_list.add(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // this references the actual object instance
        this.name = name;
    }
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Pokemon(" + getNumber() + ") '" + getName() + "' of type '" + getType();
    }

    public static void main(String[] args) {
        Pokemon p;
        p = new Pokemon("Glurak", Type.FIRE);
        System.out.println(p);


    }

    public String getTrainer() {
        return Trainer;
    }

    public void setTrainer(String trainer) {
        Trainer = trainer;
    }

    public static ArrayList<Pokemon> getPokemon_list() {
        return pokemon_list;
    }
}
