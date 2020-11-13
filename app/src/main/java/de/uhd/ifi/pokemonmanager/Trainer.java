package de.uhd.ifi.pokemonmanager;

import java.util.ArrayList;

public class Trainer{
    private String firstName;
    private String lastName;

    Trainer(String firstName1, String lastName1){
        this.firstName = firstName1;
        this.lastName = lastName1;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    ArrayList<pokemon> pokemons = pokemon_list;

    public static void main(String[] args){



    }
}
