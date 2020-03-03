package com.example.tdd.bank;

public interface MoneyExpression {
    Money reduce(Bank bank,String to);
    MoneyExpression plus(MoneyExpression money);
}
