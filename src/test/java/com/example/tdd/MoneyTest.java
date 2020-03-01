package com.example.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {

    @Test
    void testMultiplication() {
        Money five= Money.dollar(5);
        assertEquals(Money.dollar(10),five.times(2));
        assertEquals(Money.dollar(15),five.times(3));
    }

    @Test
    void testEquality() {
        assertEquals(Money.dollar(5), Money.dollar(5));
        assertNotEquals(Money.dollar(5), Money.franc(5));
    }

    @Test
    void testAdition(){
        MoneyExpression five= Money.dollar(5);
        MoneyExpression tenFrancs= Money.franc(10);
        Bank bank= new Bank();
        bank.addRate("CHF","USD",2);
        Money reduce= bank.reduce(five.plus(tenFrancs),"USD");
        assertEquals(Money.dollar(10),reduce);
    }

    @Test
    void testPlusReturnSum(){
        Money five=Money.dollar(5);
        MoneyExpression result=five.plus(five);
        Sum sum= (Sum)result;
        assertEquals(five,sum.addmend);
        assertEquals(five,sum.augmend);
    }

    @Test
    void testReduceMoneyFromDifferentCurrency(){
        Bank bank= new Bank();
        bank.addRate("CHF","USD",2);
        Money result=bank.reduce(Money.franc(2),"USD");
        assertEquals(Money.dollar(1),result);
    }
}
