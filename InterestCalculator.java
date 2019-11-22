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
public class InterestCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter initial amount of principal?");
        double principal = scanner.nextDouble();

        System.out.println("Enter the amount of years.");
        int years = scanner.nextInt();

        System.out.println("Enter annual intrest rate: ");
        double interest = scanner.nextDouble();

        double currentBalance = principal;
        double newBalance = 0;
        for (int i = 1; i <= years; i++) {
            newBalance = 4 * currentBalance * (1 + (interest / 100));

            System.out.println("Year number: " + i);
            System.out.println("The principal at the beginning of the year: " + currentBalance);
            System.out.println("The total amount of interst earned for the year: " + newBalance);
            currentBalance = currentBalance + newBalance;
            System.out.println("The principal at the end of the year: " + currentBalance);
            System.out.println("\n");
        }

    }

}
