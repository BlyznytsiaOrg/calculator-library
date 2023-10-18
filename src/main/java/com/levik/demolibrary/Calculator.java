package com.levik.demolibrary;

/**
 * A simple calculator class that performs basic arithmetic operations.
 */
public interface Calculator
{
    /**
     * Adds two numbers.
     *
     * @param num1 The first number to be added.
     * @param num2 The second number to be added.
     * @return The sum of the two numbers.
     */
    int add(int num1, int num2);

    /**
     * Subtracts two numbers.
     *
     * @param num1 The number to be subtracted from.
     * @param num2 The number to subtract.
     * @return The result of the subtraction.
     */
    int subtract(int num1, int num2) ;

    /**
     * Multiplies two numbers.
     *
     * @param num1 The first number to be multiplied.
     * @param num2 The second number to be multiplied.
     * @return The product of the two numbers.
     */
    int multiply(int num1, int num2);

    /**
     * Divides two numbers.
     *
     * @param num1 The number to be divided.
     * @param num2 The number to divide by.
     * @return The result of the division as a double.
     * @throws ArithmeticException if attempting to divide by zero.
     */
    double divide(int num1, int num2);
}
