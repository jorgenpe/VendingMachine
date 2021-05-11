package org.example.VendingMachine.Product;

import org.example.VendingMachine.Sequencer.FoodSequencer;

public class Food extends Product{

    private int foodPrice;
    private int foodProductNumber;

    public Food(String productInfo, String useProduct) {
        super(productInfo, useProduct);
    }


   public Food(String productInfo,String productUse, int foodPrice) {
        super(productInfo, productUse);
        this.foodProductNumber = FoodSequencer.nextFood();
        this.foodPrice = foodPrice;
    }

    @Override
    public int ProductNumber() {

        return 0;
    }

    @Override
    public int productPrice() {
        return 0;
    }

    public int getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(int foodPrice) {
        this.foodPrice = foodPrice;
    }
}
