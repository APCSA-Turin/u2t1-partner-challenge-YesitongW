package com.example.project;

public class CalculatorRunner {
    public static void main(String[] args) {

        //test your program here
        //1. create an instance of the calculator class
        Calculator calc1 = new Calculator("TI84");
        //2. call any methods of that class to test
        System.out.println(calc1.info());
        
        int num1 = 4;
        int num2 = 2;
        
        System.out.println(calc1.performOperation("/", num1, num2));

        if (calc1.divisibleBy(num1, num2)){
            System.out.println(num1 + " is divisible by " + num2);
        }
        else{
            System.out.println(num1 + " is not divisible by " + num2);
        }

        System.out.println("The distance between "+ num1 + " and "+ num2 +" is "+calc1.absoluteValue(num1, num2));
    }
}
