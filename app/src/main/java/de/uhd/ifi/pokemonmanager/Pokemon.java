package de.uhd.ifi.pokemonmanager;

import java.util.ArrayList;

public class Pokemon {

    private String name;
    private Type type;
    private int number;
    private static int nextNumber;
    private String trainer = "frei";

    private java.util.List<Swap> swaps;
    private boolean isSwapAllowed = false;

    private static ArrayList<Pokemon> pokemonList = new ArrayList<>();

    public static ArrayList<Pokemon> getPokemonList() {
        return pokemonList;
    }

    public Pokemon(String name, Type type) {
        this.name = name;
        this.type = type;
        this.number = nextNumber;
        nextNumber++;
        pokemonList.add(this);
        swaps = new ArrayList<>();
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
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }


    public void setSwapAllowed(boolean swapAllowed) {
        isSwapAllowed = swapAllowed;
    }

    public boolean isSwapAllowed() {
        return isSwapAllowed;
    }

    public void addSwapToList(Swap swap){
        swaps.add(swap);
    }

    public void printSwapsList() {
        for (int i = 0; i< swaps.size(); i++) {
            System.out.println(swaps.get(i).getID());
        }
    }
}

