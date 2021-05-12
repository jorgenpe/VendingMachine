package org.example.VendingMachine.Product;

import org.example.VendingMachine.Sequencer.FoodSequencer;

public class Drink extends Product{

    private int drinkPrice;
    private final int  drinkProductNumber;
    private String drinkName;


    public Drink(String productInfo,String productUse, int drinkPrice, String drinkName) {
        super(productInfo, productUse);
        this.drinkProductNumber = FoodSequencer.nextFood();
        this.drinkPrice = drinkPrice;
        this.drinkName = drinkName;
    }

    @Override
    public int ProductNumber() {

        return drinkProductNumber;
    }

    // Method that adds taxes and return the customer price
    @Override
    public  int productPrice() {

        int temp = (int)Math.round(drinkPrice * 1.18);
        return temp;
    }
}
