package org.example.VendingMachine.Sequencer;

public class SweetsSequencer {

    private static int meetingId = 30000;

    public static int nextMeetingId(){
        ;
        return ++meetingId;
    }

    public static void reset(){

        meetingId= 30000;
    }
}
