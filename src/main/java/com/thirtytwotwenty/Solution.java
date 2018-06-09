package com.thirtytwotwenty;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Solution
{
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String,String> phoneBook = null;

        // number of entries to read.
        int n = scanner.nextInt();
        if(n > 0) {
            phoneBook = new HashMap<>();

            // reached end of line. Move to start of next line
            scanner.nextLine();

            // Read n lines from input stream
            while(n > 0) {
//                String current = scanner.nextLine();
//                String[] entry = current.split(" ");
//                phoneBook.put(entry[0],entry[1]);

                phoneBook.put(scanner.next(), scanner.next());
                n--;
            }
        }

        // begin reading the entries to look up
        String name, phoneNumber = null;
        while(scanner.hasNext()) {
            name = scanner.next();
            if((phoneNumber = phoneBook.get(name)) != null) {
                System.out.printf("%s=%s", name, phoneNumber);
                System.out.println("");

            } else {
                System.out.println("Not found");
            }
        }

        // close scanner
        scanner.close();

    }
}
