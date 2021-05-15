package org.example.VendingMachine.Payment;

import java.util.ArrayList;
import java.util.List;
// Class implementing a singleton. The DepositPool handles deposit and withdrawals for the vending machine.
public class DepositPool {

    //Singleton starts.
    private static final DepositPool INSTANCE;

    static{
        INSTANCE = new DepositPool();
    }

    private int depositPool;

    // Method that you need to initiate a object of singleton
    public static DepositPool getInstance(){
        return INSTANCE;
    }

    // Private constructor
    private DepositPool(){
        this.depositPool = 0 ;
    }
    // Singleton ends

    public void setDepositPool(int depositPool) {
        this.depositPool = depositPool;
    }

    public int persist(int deposit){

        add(deposit);
        return deposit;
    }

    public void add(int deposit){

        depositPool = depositPool + deposit;

    }

    public int getDepositPool() {
        return depositPool;
    }

    public void clear(){

        depositPool = 0;
    }
}
