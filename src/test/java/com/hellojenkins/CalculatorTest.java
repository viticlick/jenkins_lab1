package com.hellojenkins;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void emptyStringShouldReturnZero(){
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.add(""));
    }
}
