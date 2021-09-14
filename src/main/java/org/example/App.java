/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jack Nelson
 */

package org.example;
import java.util.Scanner;
public class App
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.\nYour Choice: ");
        String str = sc.nextLine();
        if(str.equals("F")||str.equals("f"))
        {
            System.out.print("Please enter the temperature in Celsius: ");
            int temp = sc.nextInt();
            double fahr = (temp*9/5)+32;
            System.out.printf("The temperature in Fahrenheit is %.0f",fahr);
        }
        if(str.equals("C")||str.equals("c"))
        {
            System.out.print("Please enter the temperature in Fahrenheit: ");
            int temp = sc.nextInt();
            double Celsius = (temp-32)*5/9;
            System.out.printf("The temperature in Celsius is %.0f",Celsius);
        }
    }
}
