package org.example.VendingMachine.Product;

import org.example.VendingMachine.Sequencer.SweetsSequencer;

public class Sweets extends Product{

    private int sweetsPrice;
    private final int  sweetsProductNumber;
    private String sweetsName;


    public Sweets(String productInfo,String productUse, int sweetsPrice, String sweetsName) {
        super(productInfo, productUse);
        this.sweetsProductNumber = SweetsSequencer.nextSweets();
        this.sweetsPrice = sweetsPrice;
        this.sweetsName = sweetsName;
    }

    @Override
    public int ProductNumber() {

        return sweetsProductNumber;
    }

    // Method that adds taxes and return the customer price
    @Override
    public  int productPrice() {

        return (int)Math.round(sweetsPrice * 1.25);
    }


    public void setSweetsPrice(int sweetsPrice) {
        this.sweetsPrice = sweetsPrice;
    }

    public String getSweetsName() {
        return sweetsName;
    }

    public void setSweetsName(String sweetsName) {
        this.sweetsName = sweetsName;
    }
}
