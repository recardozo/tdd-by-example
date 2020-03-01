package com.example.tdd;

public class Dollar extends Money {
    private String currency;

    public Dollar(int amount,String currency){
        this.amount=amount;
        this.currency=currency;
    }

    @Override
    protected String currency() {
        return this.currency;
    }

    public Money times(int value) {
        return  Money.dollar(amount * value);
    }
}
