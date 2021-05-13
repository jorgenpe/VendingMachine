package org.example.VendingMachine;

import org.example.VendingMachine.EnumVendingMachine.ProductsVendingMachine;
import org.example.VendingMachine.Payment.DepositPool;
import org.example.VendingMachine.Product.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VendingMTest {

    VendingM testVendingM;
    DepositPool testDeposit;
    @BeforeEach
    void setUp() {
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
        Product result = testVendingM.request(10002);
        Product expected = ProductsVendingMachine.CheeseSandwich.food();

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


    }

    @Test
    void getBalance() {
    }

    @Test
    void getProducts() {
    }
}