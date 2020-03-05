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
        boolean result=validateIsbn.checkISBNNumber("0140449116");
        assertTrue(result);
    }

    @Test
    void checkIsbnSize(){
        ValidateIsbn validateIsbn= new ValidateIsbn();
        assertThrows(NumberFormatException.class,() -> validateIsbn.checkISBNNumber("123456789"));
    }

    @Test
    void checkIsbnIsNumber(){
        ValidateIsbn validateIsbn= new ValidateIsbn();
        assertThrows(NumberFormatException.class,() -> validateIsbn.checkISBNNumber("helloworld"));
    }

    @Test
    void checkInvalidValidISBN() {
        ValidateIsbn validateIsbn= new ValidateIsbn();
        boolean result=validateIsbn.checkISBNNumber("0140447116");
        assertFalse(result);
    }
}