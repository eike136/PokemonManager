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
        return firstName + ' ' + lastName;}

    public void addPokemon(Pokemon newPokemon){
        if (newPokemon.getTrainer().equals("frei") ){
            newPokemon.setTrainer(this.toString());
        } else {
            System.out.println("Pokemon not free");
        }
    }

    public void printSinglePokemon (Pokemon pokemon) {
        if (this.toString().equals(pokemon.getTrainer()) ){
            System.out.println(pokemon.getName());
        } else {
            System.out.println("This Pokemon doesn't belong to " + this.toString() + ". It is an asset of " + pokemon.getTrainer()+ ".");
        }
    }



    public void printAllPokemon(){
        System.out.println("All Pokemon of " + this.toString() + ":");
        for (int i = 0; i < pokemons.size(); i++) {
            if (this.toString().equals(pokemons.get(i).getTrainer()) ){
                System.out.println(pokemons.get(i).getName());
            }
        }
    }


    public void printAllPokemon(Type type){
        System.out.println("All Pokemon of " + this.toString() +" of type "+ type + ":");
        for (int i = 0; i < pokemons.size(); i++) {
            if (this.toString().equals(pokemons.get(i).getTrainer()) && pokemons.get(i).getType().equals(type)){
                System.out.println(pokemons.get(i).getName());
            }
        }
    }
    static ArrayList<Pokemon> pokemons = Pokemon.getPokemonList();

    public static void main(String[] args){
        Trainer t;
        t = new Trainer ("vorname", "nachname");
        System.out.println(t);

    }
}
