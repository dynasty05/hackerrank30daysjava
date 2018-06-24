package com.thirtytwotwenty;

import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Hello world!
 *
 */
public class Solution
{
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        int[][] arr = new int[6][6];

        // read console input and populate the 2d array
        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        scanner.close();

        SortedSet<Integer> hourglassSums = new TreeSet<Integer>();

        //move through a row n and row n+2 of the 2d array
        int row = 0;
        while(row+2 < arr.length) {
            //move through each column in the 2d array
            int column = 0;

            while(column+2 < arr.length) {
                //sum up first three consecutive column elements
                int columnTracker = column;
                int trackEnd = columnTracker+3;
                int hourglassSum = 0;

                while(columnTracker < trackEnd) {
                    hourglassSum += arr[row][columnTracker] + arr[row+2][columnTracker];
                    if(columnTracker == trackEnd-2) {
                        hourglassSum += arr[row+1][columnTracker];
                    }
                    columnTracker++;
                }
                // add latest hourglass sum to the set of hourglass sums
                hourglassSums.add(hourglassSum);

                column++;
            }

            row++;
        }

     // retrieve the largest value in treeset
        System.out.println(hourglassSums.last());

    }
}
