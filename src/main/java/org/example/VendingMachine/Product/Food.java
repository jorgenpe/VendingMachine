package org.example.VendingMachine.Product;

import org.example.VendingMachine.Sequencer.FoodSequencer;

public class Food extends Product{

    private int foodPrice;
    private final int  foodProductNumber;
    private String foodName;


   public Food(String productInfo,String productUse, int foodPrice, String foodName) {
        super(productInfo, productUse);
        this.foodProductNumber = FoodSequencer.nextFood();
        this.foodPrice = foodPrice;
        this.foodName = foodName;
    }

    @Override
    public int ProductNumber() {

        return foodProductNumber;
    }

    // Method that adds taxes and return the customer price
    @Override
    public  int productPrice() {

       int temp = (int)Math.round(foodPrice * 1.12);
       return temp;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }



    public void setFoodPrice(int foodPrice) {
        this.foodPrice = foodPrice;
    }


}
