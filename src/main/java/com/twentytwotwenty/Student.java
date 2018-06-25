package com.twentytwotwenty;

/**
 * Created by ribake on 25/06/2018.
 */
public class Student extends Person {
    private int[] testScores;

    /*
    *   Class Constructor
    *
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    public Student(String firstName, String lastName, int id, int[] testScores) {
        super(firstName, lastName, id);
        this.testScores = testScores;
    }


    /*
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    public char calculate() {
        char grade;
        int average = 0;

        for(int i=0; i<testScores.length; i++) {
            average += testScores[i];
        }

        average = average/testScores.length;

        // determing grade based on average score
        if(90<=average && average<=100) {
            grade = 'O';

        } else if(80<=average && average<90) {
            grade = 'E';

        } else if(70<=average && average<80) {
            grade = 'A';

        } else if(55<=average && average<70) {
            grade = 'P';

        } else if(40<=average && average<55) {
            grade = 'D';

        } else {
            grade = 'T';
        }

        return grade;
    }

}
