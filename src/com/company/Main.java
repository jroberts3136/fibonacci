package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        For factorial activity in class.

        Scanner keyInput = new Scanner(System.in);
        Fibonacci fib = new Fibonacci();
        int num = keyInput.nextInt();
        System.out.println(fib.factorial(num));
        */

        int num;

        Scanner keyInput = new Scanner(System.in);
        System.out.println("Enter an integer to check if it is a fibonacci number:");

        Fibonacci fib = new Fibonacci();
        num = keyInput.nextInt();

        if (fib.isFib(num)){
            System.out.println(num + " is a fibonacci number.");
            System.out.print("The sequence leading to it is: ");
            fib.fibPrint(num);
        }
        else{
            System.out.println(num + " is not a fibonacci number.");
        }
    }
}
