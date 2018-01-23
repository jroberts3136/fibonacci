package com.company;

/**
 * Created by jroberts3136 on 1/22/18.
 */
public class Fibonacci {

    private boolean search;
    private boolean inSequence;
    private int fibTemp;
    private int printTemp;
    private int testNum;
    private int[] testArray;

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
        /*
        if (n==0||n==1){
            return true;
        }

        search = true;
        fibTemp = 1;
        while (search){
            testNum = fib(fibTemp);
            if (n<testNum){
                fibTemp++;
            }
            else if (n>testNum){
                inSequence = false;
                break;
            }
            else if (n==testNum){
                inSequence = true;
                break;
            }
            testNum = fib(fibTemp);
            //fibTemp++;
        }
        return inSequence;
        */
        /*
        if (n == 0 || n == 1){
            return true;
        }

        else if (n>0){
            inSequence = false;
            search = true;
            fibTemp = 2;
            while(search){
                testNum = fib(fibTemp);
                if (n<testNum){
                    fibTemp++;
                }
                else if (n==testNum){
                    inSequence = true;
                }
            }
            return inSequence;
        }

        else{   //Deals with negative.
            return false;
        }
        */
        search = true;
        testNum = 0;
        while(search){
            if (n==fib(testNum)){
                search = false;
                inSequence = true;
            }
            else if (n<fib(testNum)){
                search = false;
                inSequence = false;
            }
        }
        return inSequence;
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
