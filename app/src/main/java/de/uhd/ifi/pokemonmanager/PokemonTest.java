package de.uhd.ifi.pokemonmanager;

public class PokemonTest {
    public static void main(String[] args) {
        // https://de.wikipedia.org/wiki/Liste_der_Pok%C3%A9mon
        // Test of Constructor with each Type
        System.out.println("Testen des Konstruktors");
        Pokemon p0 = new Pokemon("Pikachu", Type.POISON);
        System.out.println("Pokemon p0 angelegt mit Name Pikachu und Typ Poison");
        Pokemon p1 = new Pokemon("Carapuce", Type.WATER);
        System.out.println("Pokemon p1 angelegt mit Name Carapuce und Typ Water");
        Pokemon p2 = new Pokemon("Raupy", Type.FIRE);
        System.out.println("Pokemon p2 angelegt mit Name Raupy und Typ Fire");

        // Test of toString and check if each Pokemon is constructed right
        System.out.println();
        System.out.println("Testen von toString und ob alle Pokemon richtig angelegt wurden");
        System.out.println("Pokemon p0:");
        System.out.println(p0);
        System.out.println("Pokemon p1:");
        System.out.println(p1);
        System.out.println("Pokemon p2:");
        System.out.println(p2);

        // Test of getter and setter of name
        System.out.println();
        System.out.println("Testen von getName");
        System.out.println("Name von Pokemon p1:");
        System.out.println(p1.getName());
        System.out.println("Testen von setName");
        System.out.println("Name von p1 zu Schiggy ändern:");
        p1.setName("Schiggy");
        System.out.println(p1);

        // Test of getter and setter of type
        System.out.println();
        System.out.println("Testen von getType");
        System.out.println("Typ von Pokemon p2:");
        System.out.println(p2.getType());
        System.out.println("Testen von setType");
        System.out.println("Typ von p2 zu Water ändern");
        p2.setType(Type.WATER);
        System.out.println(p2);

        // Test of getter of number (no setter available, because it should not be
        // changed)
        System.out.println();
        System.out.println("Testen von getNumber");
        System.out.println("Nummer von p2: " + p2.getNumber());

        //creating new pokemon for tests
        System.out.println();
        Pokemon p3 = new Pokemon("Collector", Type.FIRE);
        Pokemon p4 = new Pokemon("Reaper", Type.POISON);
        Pokemon p5 = new Pokemon("indoctrinatedPokemon", Type.POISON);
        Pokemon p6 = new Pokemon("AlliancePokemon", Type.WATER);
        Pokemon p7 = new Pokemon("Vorcha", Type.FIRE);
        Pokemon p8 = new Pokemon("Krogan", Type.FIRE);


        //Test constructor trainer
        System.out.println("Testen Konstruktor Trainer");
        Trainer t1 = new Trainer("Legendary", "Spectre");
        Trainer t2 = new Trainer("TheIllusive", "Man");

        //Test getter and setter
        System.out.println("Testen Getter Trainer");££
        System.out.println("t1:");
        System.out.println(t1.getFirstName()+ " "+ t1.getLastName());
        System.out.println("t2:");
        System.out.println(t2.getFirstName() + " " + t2.getLastName());
        System.out.println();


        System.out.println("Testen Setter Trainer:");
        t1.setFirstName("Commander");
        t1.setLastName("Shepard");
        System.out.println("t1 name: " + t1.getFirstName() + " " + t1.getLastName());
        System.out.println();

        //Test adding new pokemon to trainer
        System.out.println("Testen Hinzufügen von Pokemon");
        t2.addPokemon(p3);
        t2.addPokemon(p4);
        t2.addPokemon(p5);

        t1.addPokemon(p6);
        t1.addPokemon(p7);
        t1.addPokemon(p8);
        System.out.println("Testen Hinzufügen von Pokemon das schon einen Trainer hat");
        t1.addPokemon(p3);
        System.out.println();

        //Test Abfrage einzelnes pokemon von Trainer
        System.out.println("Testen Abfragen Trainer von Pokemon");
        System.out.println("Trainer " + p6.getName() +": ");
        System.out.println(p6.getTrainer());
        System.out.println("Trainer " + p3.getName() +": ");
        System.out.println(p3.getTrainer());
        System.out.println();


 //       System.out.println(p1.getPokemon_list());

        System.out.println("Abfrage einzelner Pokemon");
        System.out.println("Abfrage p7 bei t1:");
        t1.printSinglePokemon(p7);
        System.out.println("Abfrage p6 bei t2:");
        t2.printSinglePokemon(p6);
        System.out.println();

        //Test Abfrage alle Pokemon von Trainer

        t1.printAllPokemon();
        t2.printAllPokemon();
        System.out.println();

        //Test Abfrage alle Pokemon von Trainer, bestimmter Typ
        t1.printAllPokemon(Type.FIRE);
        t2.printAllPokemon(Type.POISON);


    }
}