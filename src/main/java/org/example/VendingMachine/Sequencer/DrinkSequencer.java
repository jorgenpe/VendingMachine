package org.example.VendingMachine.Sequencer;

public class DrinkSequencer {


    private static int drink = 20000;

    public static int nextDrink(){

        return ++drink;
    }

    public static void reset(){

        drink = 20000;
    }
}
