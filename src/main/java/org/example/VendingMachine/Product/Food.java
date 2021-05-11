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


    @Override
    public int productPrice() {
        return foodPrice;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(int foodPrice) {
        this.foodPrice = foodPrice;
    }
}
