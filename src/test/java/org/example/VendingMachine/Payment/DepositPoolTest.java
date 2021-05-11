package org.example.VendingMachine.Payment;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepositPoolTest {

    private DepositPool testDeposit = DepositPool.getInstance();

    @BeforeEach
    void setUp() {

        testDeposit.clear();

    }

    @Test
    void persist() {


        int result = testDeposit.persist(5);
        int expected = testDeposit.getDepositPool();

        assertEquals(expected, result);
    }

    @Test
    void add() {
        int result = testDeposit.persist(5 );
        testDeposit.add(5);
        int expected = 10;

        assertEquals(expected,testDeposit.getDepositPool());
    }

    @Test
    void getDepositPool() {

        int expected = testDeposit.persist(15 );
        int result = testDeposit.getDepositPool();
        assertEquals(expected,result);
    }

    @Test
    void clear() {

        testDeposit.persist(15 );
        testDeposit.clear();
        int result = testDeposit.getDepositPool();
        int expected = 0;

        assertEquals(expected,result);

    }
}