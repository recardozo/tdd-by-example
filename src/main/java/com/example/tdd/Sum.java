package com.example.tdd;

public class Sum implements MoneyExpression {
    MoneyExpression augmend;
    MoneyExpression addmend;

    public Sum(MoneyExpression augmend, MoneyExpression addmend) {
        this.augmend = augmend;
        this.addmend = addmend;
    }

    @Override
    public Money reduce(Bank bank,String to) {
        int amount = this.augmend.reduce(bank, to).amount + this.addmend.reduce(bank, to).amount;
        return new Money(amount,to);
    }

    @Override
    public MoneyExpression plus(MoneyExpression money) {
        return null;
    }
}
