package com.thirtytwotwenty;

import java.util.Scanner;

/**
 * Created by ribake on 20/05/2018.
 */
public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String [] args) {
        int N = scanner.nextInt();
        scanner.skip("(\\r\\n|[\\n\\r\\u2028\\u2029\\u0085])?");
        scanner.close();

        boolean wierd = false;

        /*
        if (N % 2 != 0) { // odd numbers
            wierd = true;

        } else if ( N >= 2 && N <= 5) { // even numbers case 1
            wierd = false;

        } else if ( N >=6 && N <= 20) { // even numbers case 2
            wierd = true;

        } else {
            wierd = false;
        }
        */

        //  MORE ELEGANT AND CONCISE SOLUTION
        if (N % 2 != 0 || (N >=6 && N <= 20)) {
            wierd = true;
        }

        String outputString = (wierd ? "Weird" : "Not Weird");

        System.out.println(outputString);

    }
}
