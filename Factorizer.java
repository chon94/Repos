/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.excercise;

import java.util.Scanner;

/**
 *
 * @author G10-DEV10W3
 */
public class Factorizer {

    public static void main(String[] args) {

        System.out.println("Enter a number? ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        factor(number);

    }

    public static void factor(int input) {
        System.out.println("The factor of" + input + "are: ");

        int sum = 0;
        int counter = 0;

        for (int i = 1; i < input; i++) {

            int remainder = input % i;
            boolean isFactor = remainder == 0;

            if (isFactor) {
                sum = sum + i;
                System.out.println(i);
                counter++;
            }

        }
        System.out.println(sum);
        boolean isPerfect;
        isPerfect = sum == input;
        if (isPerfect) {
            System.out.println(input + " is a perfect number!");
        } else {
            System.out.println(input + " is not a perfect number!");
        }
        boolean isPrime = counter == 1;
        if (isPrime) {
            System.out.println("This is a prime number");
        } else {
            System.out.println("This not a prime number");
        }

    }
}
