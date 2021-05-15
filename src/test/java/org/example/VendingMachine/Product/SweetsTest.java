package org.example.VendingMachine.Product;


import org.example.VendingMachine.Sequencer.SweetsSequencer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Test class for Sweets. Setup before each is implemented and test on the methods of the class is done.

class SweetsTest {

    Sweets testSweets;
    @BeforeEach
    void setUp() {

        SweetsSequencer.reset();
        String testInfo = "I'am a sweetsProduct and cost 15 kr";
        String testUse = "Rip of the plastic raping and consume me";
        int testPrice = 15;
        String testName = "OrangeSweets";
        testSweets= new Sweets(testInfo, testUse, testPrice,testName);
    }

    @Test
    void SweetsNumber(){

        int result = testSweets.ProductNumber();
        int expected = 30001;

        assertEquals(expected,result);

    }


    @Test
    void setProductInfo() {

        testSweets.setProductInfo("I'am a sweetsProduct and cost 20 kr");
        String result = testSweets.getProductInfo();
        String expected = "I'am a sweetsProduct and cost 20 kr";

        assertEquals(expected, result);
    }

    @Test
    void getProductInfo() {

        String result = testSweets.getProductInfo();
        String expected = "I'am a sweetsProduct and cost 20 kr";
        assertNotEquals(expected, result);
    }

    @Test
    void getUseProduct() {

        String result = testSweets.getUseProduct();
        String expected = "Just consume me";
        assertNotEquals(expected, result);
    }

    @Test
    void setUseProduct() {

        testSweets.setUseProduct("Just consume me");
        String result = testSweets.getUseProduct();
        String expected = "Just consume me";

        assertEquals(expected,result);
    }


    @Test
    void productPrice() {

        int result =testSweets.productPrice();
        int expected = 19;

        assertEquals(expected,result);

    }

    @Test
    void setSweetsPrice() {

        testSweets.setSweetsPrice(15);
        int result =testSweets.productPrice();
        int expected = 15;

        assertNotEquals(expected,result);

    }
    @Test
    void getSweetsName() {

        String result = testSweets.getSweetsName();
        String expected = "OrangeSweets";

        assertEquals(expected,result);
    }

    @Test
    void setSweetsName() {

        testSweets.setSweetsName("ChocolateBar");
        String result = testSweets.getSweetsName();
        String expected = "OrangeSweets";

        assertNotEquals(expected, result);

    }

    @Test
    void examine() {
        String result = testSweets.examine();
        String expected = "I'am a foodProduct and cost 20 kr";
        assertNotEquals(expected, result);
    }

    @Test
    void use() {

        String result = testSweets.use();
        String expected = "Just consume me";
        assertNotEquals(expected, result);

    }

}