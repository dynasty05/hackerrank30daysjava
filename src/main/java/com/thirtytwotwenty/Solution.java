package com.thirtytwotwenty;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Solution {
    public static void main( String[] args ) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        // read the number of test cases
        int testCases = scanner.nextInt();
        String[] resultStrings = new String[testCases];

        // read each input string, process it and store in array
        for(int i=1; i<=testCases; i++) {
            // array index needs to be 1 place behind
            resultStrings[i-1] = separateOddEvenCharacters(scanner.next());
        }

        // print the results
        for(String s: resultStrings) {
            System.out.println(s);
        }

        // close the scanner
        scanner.close();
    }

    /**
     * Process the input parameter and get the even-indexed characters
     * separated with a space followed by the odd-indexed characters.
     * @param input
     * @return
     */
    private static String separateOddEvenCharacters(String input) {
        String result = null;

        StringBuilder evens = new StringBuilder();
        StringBuilder odds = new StringBuilder();

        for(int i=0; i<input.length(); i++) {
            char current = input.charAt(i);
            if(i%2 == 0) {
                evens.append(current);

            } else {
                odds.append(current);
            }
        }

        return result = evens.toString() + " " + odds.toString();
    }
}
