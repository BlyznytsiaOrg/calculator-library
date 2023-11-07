package com.levik.demolibrary;

import com.levik.demolibrary.impl.SimpleCalculator;

/**
 * The `CalculatorExecutor` class is a simple application that demonstrates the usage of the `SimpleCalculator`
 * by performing basic arithmetic operations and displaying the results.
 */
public class CalculatorExecutor {

    /**
     * The main entry point of the application.
     *
     * @param args The command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        // Create an instance of the SimpleCalculator
        Calculator calculator = new SimpleCalculator();

        // Perform arithmetic operations
        System.out.println("Great calculator");
        int result1 = calculator.add(5, 3);
        int result2 = calculator.subtract(10, 4);
        int result3 = calculator.multiply(6, 7);
        double result4 = calculator.divide(8, 2);

        // Display the results
        System.out.println("5 + 3 = " + result1);
        System.out.println("10 - 4 = " + result2);
        System.out.println("6 * 7 = " + result3);
        System.out.println("8 / 2 = " + result4);
    }
}
