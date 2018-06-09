package com.twentytwotwenty;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Solution
{
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number >= 2 && number <= 12) {
            System.out.println(factorial(number));
        }

        scanner.close();
    }

    static int factorial(int n){
        //base condition
        if(n == 1) {
            return 1;

        } else {
            return n * factorial(n-1);
        }
    }
}
