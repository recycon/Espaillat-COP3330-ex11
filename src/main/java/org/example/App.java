package org.example;
import java.util.Scanner;
import java.lang.System;

/**
 * How many euros are you exchanging? 81
 * What is the exchange rate? 1.3751
 * 81 euros at an exchange rate of 1.3751 is
 * 111.38 U.S. dollars.
 *
 */

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021  Mario Espaillat
 */
public class App 
{
    public static void main( String[] args )

    {
        double c_to;
        int c_frame;
        double rate;
        Scanner in = new Scanner(System.in);
        double x;


        System.out.println( "How many euros are you exchanging? " );
        c_frame=in.nextInt();
        System.out.println( "What is the exchange rate? " );
        rate=in.nextDouble();
        c_to=rate * c_frame;

        double round=Math.round(c_to * 100.0)/100.00;
        System.out.println( c_frame+" euros at an exchange rate of "+rate+ " is\n" +
                round+ " U.S. dollars." );

    }
}
