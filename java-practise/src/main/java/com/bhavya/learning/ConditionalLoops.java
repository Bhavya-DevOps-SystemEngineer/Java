package com.bhavya.learning;

public class ConditionalLoops {
    public static void main(String[] args) {

        int score = 72;
        // if else if else loop
        if (score >= 90)
            System.out.println("Grade A");
        else if (score >= 60)
            System.out.println("Grade B");
        else
            System.err.println("Grade C");

        // Switch

        int day = 3;

        String dayName = switch (day) {

            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> "Unknown";

        };
        System.out.println("Today is : " + dayName);

        // for loop

        for (

                int i = 0; i <= 5; i++) {
            System.out.println(i);
        }
        // while loop

        int n = 0;
        while (n <= 5) {
            System.out.println("n = " + n);
            n += 1;
        }
    }
}
