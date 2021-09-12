/*
 * UCF COP3330 Fall 2021 Assignment 9 Solution
 * Copyright 2021 Noah Taylor
 */

package org.example;

import java.util.Scanner;
import java.lang.Math;

public class App {
    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);

        System.out.println( "What is the length of the room?" );
        double length = input.nextDouble();
        System.out.println( "What is the width of the room?" );
        double width = input.nextDouble();

        double area = length * width;
        double gallonCovers = 350;
        double gallonsNeeded = Math.ceil(area / gallonCovers);

        System.out.println("You will need to purchase " + (int)gallonsNeeded +
                " gallons of paint to cover " + area + " square feet.");
    }
}