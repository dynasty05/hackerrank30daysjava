package com.thirtytwotwenty;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Solution
{
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        for(int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        // reverse pass the array and build a result string
        StringBuilder resultBuilder = new StringBuilder();

        for(int i=n-1; i>=0; i--) {
            resultBuilder.append(Integer.toString(arr[i]));
            if(n > 0) {
                resultBuilder.append(" ");
            }
        }

        // print the result
        System.out.println(resultBuilder.toString());



    }
}
