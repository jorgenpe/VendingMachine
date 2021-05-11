package org.example.VendingMachine;

import org.example.VendingMachine.Product.Product;

public class VendingM implements VendingMachine{

    private int currency;
    private int productNumber;
    

    @Override
    public void addCurrency(int amount) {

    }

    @Override
    public Product request(int productNumber) {
        return null;
    }

    @Override
    public int endSession() {
        return 0;
    }

    @Override
    public String GetDescription(int productNumber) {
        return null;
    }

    @Override
    public int getBalance() {
        return 0;
    }

    @Override
    public String[] getProducts() {
        return new String[0];
    }
}
