package com.example.tdd.isbn;

import java.util.Objects;

public class ValidateIsbn {
    public boolean checkISBNNumber(String isbnNumber) {

        int total = 0;
        checkISBNSize(isbnNumber);

        for (int i = 0; i < isbnNumber.length(); i++) {
            total += isbnNumber.charAt(i) * (isbnNumber.length() - i);
        }
        return total % 11 == 0;
    }

    private void checkISBNSize(String isbnNumber) {
        if (!Objects.equals(isbnNumber.length(),10)) {
            throw new NumberFormatException("Número ISBN tem que ter dez caracteres");
        }

        Integer.parseInt(isbnNumber);
    }
}
