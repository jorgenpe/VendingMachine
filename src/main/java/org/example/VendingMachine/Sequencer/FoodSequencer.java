package org.example.VendingMachine.Sequencer;

public class FoodSequencer {

    private static int food = 10000;

    public static int nextFood(){

        return ++food;
    }

    public static void reset(){

        food = 10000;
    }


}
