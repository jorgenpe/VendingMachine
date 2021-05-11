package org.example.VendingMachine.Sequencer;

public class FoodSequencer {

    private static int appUserId = 10000;

    public static int nextAppUserId(){

        return ++appUserId;
    }

    public static void reset(){

        appUserId = 10000;
    }


}
