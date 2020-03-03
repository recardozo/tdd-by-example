package com.example.tdd.isbn;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateIsbnTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void checkValidISBN() {
        ValidateIsbn validateIsbn= new ValidateIsbn();
        boolean result=validateIsbn.checkISBNNumber(140449116);
        assertTrue(result);
    }

    @Test
    void checkInvalidValidISBN() {
        ValidateIsbn validateIsbn= new ValidateIsbn();
        boolean result=validateIsbn.checkISBNNumber(140449116);
        assertFalse(result);
    }
}