package com.example.tdd;

public class Franc extends Money{
    private final String currency;

    public Franc(int amount, String currency){
        this.amount=amount;
        this.currency=currency;
    }

    @Override
    protected String currency() {
        return this.currency;
    }

    public Money times(int value) {
        return Money.franc(amount * value);
    }
}
