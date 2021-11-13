package com.example.mycalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyCalculatorApplication {

    public void addingNumbers(int numberA, int numberB){

        int addingResult = numberA + numberB;
        System.out.println("Result of adding " + numberA + " and " + numberB + " is " + addingResult);
    }

    public void subtractingNumbers(int numberA, int numberB){

        int subtractionResult = numberA - numberB;
        System.out.println("Result of subtracting " + numberA + " and " + numberB + " is " + subtractionResult);
    }

    public static void main(String[] args) {
        System.out.println("Calculator works");
        MyCalculatorApplication calculator = new MyCalculatorApplication();
        calculator.addingNumbers(7, 5);
        calculator.subtractingNumbers(10,8);

    }


}
