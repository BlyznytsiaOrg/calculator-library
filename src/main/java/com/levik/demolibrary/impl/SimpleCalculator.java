package com.levik.demolibrary.impl;

import com.levik.demolibrary.Calculator;

/**
 * A simple implementation of the Calculator interface that performs basic arithmetic operations.
 */
public class SimpleCalculator implements Calculator {

    /**
     * Adds two integers.
     *
     * @param num1 The first integer to be added.
     * @param num2 The second integer to be added.
     * @return The sum of the two integers.
     */
    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * Subtracts two integers.
     *
     * @param num1 The integer to be subtracted from.
     * @param num2 The integer to subtract.
     * @return The result of the subtraction.
     */
    @Override
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    /**
     * Multiplies two integers.
     *
     * @param num1 The first integer to be multiplied.
     * @param num2 The second integer to be multiplied.
     * @return The product of the two integers.
     */
    @Override
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    /**
     * Divides two integers.
     *
     * @param num1 The integer to be divided.
     * @param num2 The integer to divide by.
     * @return The result of the division as a double.
     * @throws ArithmeticException if attempting to divide by zero.
     */
    @Override
    public double divide(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return (double) num1 / num2;
    }
}

