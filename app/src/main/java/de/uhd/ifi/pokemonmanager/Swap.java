/*
 * Copyright (c)
 */
package de.uhd.ifi.pokemonmanager;

import java.util.Date;

/**
 * This class provides swapping of Pokemons if it is allowed and the trainer actually changes.
 *
 * @author Eike Burkahrdt
 * @version 1.2 15 Nov 2020
 */
public class Swap {

    private java.util.Date date = new Date();
    private String id = "";
    private Pokemon p1;
    private Pokemon p2;

    Swap(Pokemon p1, Pokemon p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.id = String.valueOf((p1.getTrainer() + p1.getName() + p2.getName()
                + p2.getTrainer()).hashCode());
    }

    /**
     * The swapping is executed if the pokemon's isSwappingAllowed attribute is true and the new
     * trainer is different from the old one. Otherwise it is declined.
     */
    public void execute() {

        /* New trainer != old trainer?*/
        if (p1.getTrainer().equals(p2.getTrainer())) {
            System.out.println("Warning: " + p1.getName() + " and " + p2.getName()
                    + " have the same trainer." + " No swapping.");
            return;
        }

        /* Swapping allowed?" */
        if (!p1.isSwapAllowed()) {
            System.out.println("Swapping not allowed for " + p1.getName() + "!");
            return;
        }
        if (!p2.isSwapAllowed()) {
            System.out.println("Swapping not allowed for " + p1.getName() + "!");
        }

        /* Checks passed, swapping takes place. */
        else {
            String swapTrainer = p1.getTrainer();
            p2.setTrainer(swapTrainer);
            p1.setTrainer(p2.getTrainer());
            System.out.println("Swapping ok. " + p1.getName() + " has new trainer " + p1.getTrainer()
                    + ", " + p2.getName() + " has new trainer " + p2.getTrainer() + ". " + date);
        }
    }

    public String getId() {
        return id;
    }
}
