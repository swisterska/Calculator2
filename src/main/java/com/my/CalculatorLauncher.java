package com.my;

public class CalculatorLauncher {
    public static void main(String[] args) {
        System.out.println("Coming soon!");
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        return (double) a / b;
    }

    public double divideSafe(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return (double) a / b;
    }



}