package com.example.tdd.isbn;

import java.util.Objects;

public class ValidateIsbn {
    public boolean checkISBNNumber(String isbnNumber) {

        int total = 0;
        checkISBNSize(isbnNumber);

        for (int i = 0; i < isbnNumber.length(); i++) {

            if (!Character.isDigit(isbnNumber.charAt(i))) {
                if (Objects.equals(i, 9) && Objects.equals(isbnNumber.charAt(i), 'X')) {
                    total += 10;
                } else {
                    throw new NumberFormatException("Número ISBN tem que ter dez caracteres");
                }
            } else {
                total += Character.getNumericValue(isbnNumber.charAt(i)) * (isbnNumber.length() - i);
            }
        }
        return total % 11 == 0;
    }

    private void checkISBNSize(String isbnNumber) {
        if (!Objects.equals(isbnNumber.length(), 10)) {
            throw new NumberFormatException("Número ISBN tem que ter dez caracteres");
        }
    }

    private void checkISBNCharacteres(String isbnNumber, int index) {
        if (!Character.isDigit(isbnNumber.charAt(index))) {
            if (!Objects.equals(index, 9) && !Objects.equals(isbnNumber.charAt(index), 'X')) {
                throw new NumberFormatException("Número ISBN tem que ter dez caracteres");
            }

        }
    }
}
