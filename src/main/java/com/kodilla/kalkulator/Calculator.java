package com.kodilla.kalkulator;

public class Calculator {
    int a;
    int b;

    public int add(int a, int b) {
        return a+b;
    }
    public int substract(int a, int b){
        return a-b;
    }
    public static void main(String args[]){
        Calculator calculator = new Calculator();
        int add = calculator.add(7, 5);
        int sub = calculator.substract(7,5);
        System.out.println(add);
        System.out.println(sub);
    }
}
