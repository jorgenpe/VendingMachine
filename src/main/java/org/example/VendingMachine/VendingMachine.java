package org.example.VendingMachine;

import org.example.VendingMachine.Product.Product;

public interface VendingMachine {

    void addCurrency(int amount);
    Product request(int productNumber);
    int endSession();
    String GetDescription(int productNumber);
    int getBalance();
    String[] getProducts();
}
