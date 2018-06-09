package com.thirtytwotwenty;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Unit test for simple Solution.
 */
public class SolutionTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    // BASED ON HACKERANK'S SOLUTION TEMPLATE
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        HashMap<String,String> phoneBook = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phoneBook.put(name, new Integer(phone).toString());
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(phoneBook.get(s) != null) {
                System.out.printf("%s=%s", s, phoneBook.get(s));
                System.out.println("");

            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
