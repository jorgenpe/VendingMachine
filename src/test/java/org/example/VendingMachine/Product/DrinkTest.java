package org.example.VendingMachine.Product;

import org.example.VendingMachine.Sequencer.DrinkSequencer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrinkTest {

    Drink testDrink;
    @BeforeEach
    void setUp() {
        DrinkSequencer.reset();
        String testInfo = "I'am a drinkProduct and cost 15 kr";
        String testUse = "Open and consume me";
        int testPrice = 15;
        String testName = "Cola";
        testDrink = new Drink(testInfo, testUse, testPrice,testName);
    }

    @Test
    void DrinkNumber(){

        int result = testDrink.ProductNumber();
        int expected = 20001;

        assertEquals(expected,result);

    }


    @Test
    void setProductInfo() {

        testDrink.setProductInfo("I'am a drinkProduct and cost 20 kr");
        String result = testDrink.getProductInfo();
        String expected = "I'am a drinkProduct and cost 20 kr";

        assertEquals(expected, result);
    }

    @Test
    void getProductInfo() {

        String result = testDrink.getProductInfo();
        String expected = "I'am a drinkProduct and cost 20 kr";
        assertNotEquals(expected, result);
    }

    @Test
    void getUseProduct() {

        String result = testDrink.getUseProduct();
        String expected = "Just consume me";
        assertNotEquals(expected, result);
    }

    @Test
    void setUseProduct() {

        testDrink.setUseProduct("Just consume me");
        String result = testDrink.getUseProduct();
        String expected = "Just consume me";

        assertEquals(expected,result);
    }


    @Test
    void productPrice() {

        int result =testDrink.productPrice();
        int expected = 18;

        assertEquals(expected,result);

    }

    @Test
    void setDrinkPrice() {

        testDrink.setDrinkPrice(15);
        int result =testDrink.productPrice();
        int expected = 15;

        assertNotEquals(expected,result);

    }
    @Test
    void getDrinkName() {

        String result = testDrink.getDrinkName();
        String expected = "Cola";

        assertEquals(expected,result);
    }

    @Test
    void setDrinkName() {

        testDrink.setDrinkName("Orange");
        String result = testDrink.getDrinkName();
        String expected = "Cola";

        assertNotEquals(expected, result);

    }

    @Test
    void examine() {
        String result = testDrink.examine();
        String expected = "I'am a foodProduct and cost 20 kr";
        assertNotEquals(expected, result);
    }

    @Test
    void use() {

        String result = testDrink.use();
        String expected = "Just consume me";
        assertNotEquals(expected, result);

    }

}