package com.example.tdd;

import java.util.Objects;

public  class Money implements MoneyExpression {
    public int amount;
    private String currency;

    public Money(int amount, String currency) {
        this.amount=amount;
        this.currency=currency;
    }

    private  String currency(){
        return this.currency;
    }

    public MoneyExpression times(int value) {
        return  new Money(amount * value,this.currency);
    }

    public static Money dollar(int amount){
        return new Money(amount,"USD");
    }

    public static Money franc(int amount){
        return new Money(amount,"CHF");
    }

    public MoneyExpression plus(MoneyExpression money) {
        return new Sum(this,money);
    }

    @Override
    public Money reduce(Bank bank,String to) {
        int amount = this.amount / bank.rate(this.currency,to);
        return new Money(amount,to);
    }

    public boolean equals(Object object) {
        if (Objects.isNull(object)) {
            return false;
        }
        Money money = (Money) object;
        return Objects.equals(amount, money.amount) &&
                Objects.equals(this.currency, ((Money) object).currency());
    }


}
