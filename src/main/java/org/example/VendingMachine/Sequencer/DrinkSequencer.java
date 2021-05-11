package org.example.VendingMachine.Sequencer;

public class DrinkSequencer {


    private static int personId = 20000;

    public static int nextPersonId(){

        return ++personId;
    }

    public static void reset(){

        personId = 20000;
    }
}
