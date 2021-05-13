package org.example.VendingMachine.Product;

import org.example.VendingMachine.Sequencer.DrinkSequencer;


public class Drink extends Product{

    private int drinkPrice;
    private final int  drinkProductNumber;
    private String drinkName;


    public Drink(String productInfo,String productUse, int drinkPrice, String drinkName) {
        super(productInfo, productUse);
        this.drinkProductNumber = DrinkSequencer.nextDrink();
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


    public void setDrinkPrice(int drinkPrice) {
        this.drinkPrice = drinkPrice;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }
}
