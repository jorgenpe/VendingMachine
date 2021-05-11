package org.example.VendingMachine.Sequencer;

public class SweetsSequencer {

    private static int sweets= 30000;

    public static int nextMeetingId(){
        ;
        return ++sweets;
    }

    public static void reset(){

        sweets= 30000;
    }
}
