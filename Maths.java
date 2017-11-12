package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Maths {

    public static void main(String[] args) throws IOException {
       int sum, sub, mult, numberA, numberB;

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your number: ");
        numberA = reader.nextInt();

        System.out.println("Enter the second number: ");
        numberB = reader.nextInt();

        sum = numberA + numberB;
        System.out.println("The sum of the two numbers you entered = " + sum);

        sub = numberA - numberB;
        System.out.println("The subtraction of the two numbers you entered = " + sub);

        mult = numberA * numberB;
        System.out.println("The multiplication of the two numbers you entered = " + mult);

        reader.close();
    }
}
