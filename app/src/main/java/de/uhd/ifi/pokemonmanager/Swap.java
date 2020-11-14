package de.uhd.ifi.pokemonmanager;



import java.util.Calendar;
import java.util.Date;

public class Swap {
    private Trainer trainer1;
    private Pokemon pokemon1;
    private Trainer trainer2;
    private Pokemon pokemon2;
    private String id;

    private java.util.Date date = Calendar.getInstance().getTime();


    public Swap(Trainer t1, Pokemon p1, Trainer t2, Pokemon p2 ){
        trainer1 = t1;
        trainer2 = t2;
        pokemon1 = p1;
        pokemon2 = p2;
        date = new Date();
        id = trainer1.toString()+pokemon1.toString()+trainer2.toString()+pokemon2.toString()+date.toString();
    }

    public void execute() {
        String poke = "Pokeomn ";
        boolean allowed = true;
        boolean notAllowed = false;

        if (trainer1.equals(trainer2)) {
            System.out.println(poke + pokemon1.getName() +" kann nicht mit "+pokemon2.getName()+" getauscht werden, da beide den Trainer "+trainer1.toString()+" haben.");

        } else if (!(trainer1.toString().equals(pokemon1.getTrainer())) || !(trainer2.toString().equals(pokemon2.getTrainer())) ) {
            System.out.println("Trainer können nur ihre eigenen Pokemon tauschen.");

        } else {


            if (pokemon1.isSwapAllowed() == allowed && pokemon2.isSwapAllowed() == allowed) {
                pokemon1.setTrainer(trainer2.toString());
                pokemon2.setTrainer(trainer1.toString());
                System.out.println(trainer1.toString() +" und " + trainer2.toString() + " haben " + pokemon1.getName() + " und " + pokemon2.getName() +" getauscht.");
                pokemon1.addSwapToList(this);
                pokemon2.addSwapToList(this);

            } else {
                if (pokemon1.isSwapAllowed() == notAllowed) {
                    System.out.println(poke + pokemon1.getName()+" ist nicht zum Tauschen freigegeben.");
                }
                if (pokemon2.isSwapAllowed() == notAllowed) {
                    System.out.println(poke + pokemon2.getName() + " ist nicht zum Tauschen freigegeben.");
                }
            }
        }
    }




    public Pokemon getPokemon1() {
        return pokemon1;
    }

    public Pokemon getPokemon2() {
        return pokemon2;
    }

    public Date getDate() {
        return date;
    }

    public String getID() {
        return id;
    }

}
