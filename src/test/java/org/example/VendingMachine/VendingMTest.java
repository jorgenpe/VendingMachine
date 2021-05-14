package org.example.VendingMachine;

import org.example.VendingMachine.EnumVendingMachine.ProductsVendingMachine;
import org.example.VendingMachine.Payment.DepositPool;
import org.example.VendingMachine.Product.Product;
import org.example.VendingMachine.Sequencer.DrinkSequencer;
import org.example.VendingMachine.Sequencer.FoodSequencer;
import org.example.VendingMachine.Sequencer.SweetsSequencer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VendingMTest {

    VendingM testVendingM;
    DepositPool testDeposit;
    @BeforeEach
    void setUp() {

        DrinkSequencer.reset();
        SweetsSequencer.reset();
        FoodSequencer.reset();
        testDeposit = DepositPool.getInstance();
        testDeposit.setDepositPool(0);
        testVendingM = new VendingM();

    }

    @Test
    void addCurrency() {

        testVendingM.addCurrency(10);
        int result = testDeposit.getDepositPool();
        int expected = 10;

        assertEquals(expected,result);


    }

    @Test
    void request() {

        testVendingM.addCurrency(20);
        Product result = testVendingM.request(20001);
        Product expected = ProductsVendingMachine.ColaDrink.drink();

        assertEquals(expected,result);

    }

    @Test
    void endSession() {

        testVendingM.addCurrency(20);
        int result = testVendingM.endSession();
        int expected = 20;

        assertEquals(expected,result);

    }

    @Test
    void getDescription() {

        String result = testVendingM.GetDescription(20001);
        String expected = "I'Am a drinkProduct and cost 15 kr";

        assertEquals(expected,result);

    }

    @Test
    void getBalance() {

        int result = testVendingM.getBalance();
        int expected = 0;

        assertEquals(expected,result);
    }

    @Test
    void getProducts() {

        ProductsVendingMachine testV = ProductsVendingMachine.OrangeSweets;

        String[] temp = testVendingM.getProducts();
        String result = temp[temp.length - 1];
        String expected = "Name: " + testV.sweets().getSweetsName() + " Product number: " + testV.sweets().ProductNumber();

        assertEquals(expected,result);


    }
}