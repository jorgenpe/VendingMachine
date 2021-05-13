package org.example.VendingMachine.Product;

import org.example.VendingMachine.Sequencer.FoodSequencer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FoodTest {

    Food testFood;
    @BeforeEach
    void setUp() {
        FoodSequencer.reset();
        String testInfo = "I'am a foodProduct and cost 15 kr";
        String testUse = "Rip of the plastic raping and consume me";
        int testPrice = 15;
        String testName = "Ham Sandwich";
        testFood = new Food(testInfo, testUse, testPrice,testName);
    }

    @Test
    void FoodNumber(){

        int result = testFood.ProductNumber();
        int expected = 10001;

        assertEquals(expected,result);

    }


    @Test
    void setProductInfo() {

         testFood.setProductInfo("I'am a foodProduct and cost 20 kr");
         String result = testFood.getProductInfo();
         String expected = "I'am a foodProduct and cost 20 kr";

         assertEquals(expected, result);
    }

    @Test
    void getProductInfo() {

        String result = testFood.getProductInfo();
        String expected = "I'am a foodProduct and cost 20 kr";
        assertNotEquals(expected, result);
    }

    @Test
    void getUseProduct() {

        String result = testFood.getUseProduct();
        String expected = "Just consume me";
        assertNotEquals(expected, result);
    }

    @Test
    void setUseProduct() {

        testFood.setUseProduct("Just consume me");
        String result = testFood.getUseProduct();
        String expected = "Just consume me";

        assertEquals(expected,result);
    }


    @Test
    void productPrice() {

        int result =testFood.productPrice();
        int expected = 17;

        assertEquals(expected,result);

    }

    @Test
    void setFoodPrice() {

        testFood.setFoodPrice(15);
        int result =testFood.productPrice();
        int expected = 15;

        assertNotEquals(expected,result);

    }
    @Test
    void getFoodName() {

        String result = testFood.getFoodName();
        String expected = "Ham Sandwich";

        assertEquals(expected,result);
    }

    @Test
    void setFoodName() {

        testFood.setFoodName("Cheese Sandwich");
        String result = testFood.getFoodName();
        String expected = "Ham Sandwich";

        assertNotEquals(expected, result);

    }


    @Test
    void examine() {
        String result = testFood.examine();
        String expected = "I'am a foodProduct and cost 20 kr";
        assertNotEquals(expected, result);
    }

    @Test
    void use() {

        String result = testFood.use();
        String expected = "Just consume me";
        assertNotEquals(expected, result);

    }
}