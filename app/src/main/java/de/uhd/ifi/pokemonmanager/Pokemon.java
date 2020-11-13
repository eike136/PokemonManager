package de.uhd.ifi.pokemonmanager;

public class Pokemon {

    private String name;
    private Type type;
    private int number;
    private static int nextNumber;

    public Pokemon(String name, Type type) {
        this.name = name;
        this.type = type;
        this.number = nextNumber;
        nextNumber++;
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
}
