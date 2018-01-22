package com.company;

/**
 * Created by jroberts3136 on 1/22/18.
 */
public class Fibonacci {

    boolean search;
    boolean isFib;
    int fibTemp;
    int printTemp;
    int test;

    public Fibonacci(){

    }

    public int fib (int n){
        if (n==0){
            return 0;
        }
        else if (n==1){
            return 1;
        }
        else{
            return fib(n-1) + fib(n-2);
        }
    }

    public boolean isFib(int n){
        search = true;
        fibTemp = 0;
        while (search){
            test = fib(fibTemp);
            if (n<test){
                fibTemp++;
            }
            else if (n>test){
                isFib = false;
                break;
            }
            else if (n==test){
                isFib = true;
                break;
            }
            test = fib(fibTemp);
            //fibTemp++;
        }
        return isFib;
    }

    public void fibPrint(int n){
        printTemp = 0;
        while (printTemp<=n){
            System.out.print(fib(printTemp));
            if (printTemp < n){
                System.out.print(", ");
            }
            printTemp++;
        }
    }

    public int factorial(int n){
        if (n==0){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
}
