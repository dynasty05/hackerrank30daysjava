package com.thirtytwotwenty;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

/**
 *
 *
 */
public class Solution {
    private static ArrayDeque<Integer> remainders = new ArrayDeque<>();

    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        binary(n);
        printMaximumNumberOfConsecutiveOnes();

    }

    /**
     * Print the maximum number of consecutive 1's in the
     * binary representation in the global stack
     */
    private static void printMaximumNumberOfConsecutiveOnes() {
        int currentCounter, previousCounter;
        currentCounter = previousCounter = 0;

        while (!remainders.isEmpty()) {
            // plus 1 for every occurrence of 1
            if(remainders.pop() == 1) {
                currentCounter++;

            } else {
                // it's a 0. Replace value of previous counter only if current 1's is more than previous
                if(previousCounter < currentCounter) {
                    previousCounter = currentCounter;

                }
                currentCounter = 0;

            }
        }
        int maximumNumberOfOnes = (previousCounter > currentCounter ? previousCounter : currentCounter);
        System.out.println(maximumNumberOfOnes);
    }

    /**
     * Find the binary representation of n using a recursive method
     * @param n
     */
    private static void binary(int n) {
        // base condition
        if(n/2 == 0) {
            remainders.push(n%2);

        } else {
            int q = n/2;
            remainders.push(n%2);
            binary(q);
        }
    }

}
