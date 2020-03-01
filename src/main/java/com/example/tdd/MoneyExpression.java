package com.example.tdd;

public interface MoneyExpression {
    Money reduce(Bank bank,String to);
    MoneyExpression plus(MoneyExpression money);
}
