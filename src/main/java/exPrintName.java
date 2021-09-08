/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Riya Singh
 */
import java.util.Scanner;
public class exPrintName
{
    public static void main(String[] args)
    {
        System.out.println("What is your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello, " + name + ", nice to meet you!");
    }
}