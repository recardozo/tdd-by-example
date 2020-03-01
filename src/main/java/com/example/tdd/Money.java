package com.example.tdd;

import java.util.Objects;

public abstract class Money {
    protected int amount;
    protected abstract String currency();

    public abstract Money times(int multiplier);

    public static Money dollar(int amount){
        return new Dollar(amount,"USD");
    }

    public static Money franc(int amount){
        return new Franc(amount,"CFH");
    }

    public boolean equals(Object object) {
        if (Objects.isNull(object)) {
            return false;
        }
        Money money = (Money) object;
        return Objects.equals(amount, money.amount) &&
                Objects.equals(this.getClass(), object.getClass());
    }
}
