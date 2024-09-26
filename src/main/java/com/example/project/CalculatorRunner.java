package com.example.project;

public class CalculatorRunner {
    public static void main(String[] args) {

        //test your program here
        //1. create an instance of the calculator class
        Calculator calc1 = new Calculator("TI84");
        //2. call any methods of that class to test
        System.out.println(calc1.info());
        
        int num1 = 9;
        int num2 = 4;
        if (calc1.divisibleBy(num1, num2)){
            System.out.println(num1 + " is divisible by " + num2);
        }
        else{
            System.out.println(num1 + " is not divisible by " + num2);
        }

        int num3 = -9;
        int num4 = 6;

        System.out.println("The absolute value of "+ num3 + " and "+ num4 +" is "+calc1.absoluteValue(num3, num4));
    }
}
