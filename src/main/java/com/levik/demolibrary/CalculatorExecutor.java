package com.levik.demolibrary;

import com.levik.demolibrary.impl.SimpleCalculator;

public class CalculatorExecutor {

    public static void main(String[] args) {
        Calculator calculator = new SimpleCalculator();

        int result1 = calculator.add(5, 3);
        int result2 = calculator.subtract(10, 4);
        int result3 = calculator.multiply(6, 7);
        double result4 = calculator.divide(8, 2);

        System.out.println("5 + 3 = " + result1);
        System.out.println("10 - 4 = " + result2);
        System.out.println("6 * 7 = " + result3);
        System.out.println("8 / 2 = " + result4);
    }
}
