package org.example;
import java.util.Scanner;

/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Yeshwanth Mandava
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        double Principal = input.nextDouble();
        System.out.print("Enter the rate of interest as a whole percentage: ");
        double rate = input.nextDouble();
        System.out.print("Enter the number of years: ");
        int time = input.nextInt();

        double SI = Principal*(1 +((rate/100.0)*time));
        System.out.printf("After %d years at %.2f%%, the investment will be worth $%.2f", time, rate, SI);

    }
}
