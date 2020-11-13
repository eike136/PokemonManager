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
        if (newPokemon.getTrainer() == "frei"){
            newPokemon.setTrainer(this.toString());
        } else {
            System.out.println("Pokemon not free");
        }
    }

    public void printSinglePokemon (Pokemon pokemon) {
        for (int i = 0; i < pokemons.size(); i++) {
            if (this.toString() == pokemon.getTrainer() ){
                System.out.println(pokemon.getName());
            } else {
                System.out.println("This Pokemon doesn't belong to this trainier");
            }
        }
    }

    public void printAllPokemon(){
        for (int i = 0; i < pokemons.size(); i++) {
            if (this.toString() == pokemons.get(i).getTrainer() ){
                System.out.println(pokemons.get(i).getName());
            }
        }
    }

    public void printAllPokemon(Type type){
        for (int i = 0; i < pokemons.size(); i++) {
            if ((this.toString() == pokemons.get(i).getTrainer()) && (pokemons.get(i).getType() == type)){
                System.out.println(pokemons.get(i).getName());
            }
        }
    }
    ArrayList<Pokemon> pokemons = Pokemon.pokemon_list;

    public static void main(String[] args){



    }
}
