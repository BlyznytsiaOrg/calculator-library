package com.levik.demolibrary.impl;

import com.levik.demolibrary.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SimpleCalculatorTest {

    private Calculator testInstance;

    @BeforeEach
    void setUp() {
        testInstance = new SimpleCalculator();
    }

    @Test
    void add() {
        int expected = 4;
        int actual = testInstance.add(2, 2);

        assertThat(actual).isEqualTo(3);
    }

    @Test
    void subtract() {
        int expected = 0;
        int actual = testInstance.subtract(2, 2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void divide() {
        double expected = 1.0;
        double actual = testInstance.divide(2, 2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void multiply() {
        int expected = 4;
        int actual = testInstance.multiply(2, 2);

        assertThat(actual).isEqualTo(expected);
    }
}