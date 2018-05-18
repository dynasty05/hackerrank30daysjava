package com.thirtytwotwenty.thirtydayjava.day2;

import java.util.Scanner;

/**
 * Created by ribake on 13/05/2018.
 */
public class Solution {

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        double meal_cost = scanner.nextDouble();
        int tip_percent = scanner.nextInt();
        int tax_percent = scanner.nextInt();
        scanner.close();

        double tip_percentPrecise = (double)tip_percent/100;
        double tipCost = meal_cost * tip_percentPrecise;

        double tax_percentPrecise = (double)tax_percent/100;
        double taxCost = meal_cost * tax_percentPrecise;

        double mealTotalPrecise = meal_cost + tipCost + taxCost;
        long mealTotal = Math.round(mealTotalPrecise);

        System.out.println("The total meal cost is " + mealTotal + " dollars");
    }
}
