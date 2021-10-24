package com.pb.zelenskyi.hw3;

import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        System.out.println("The game 'BINGO 'started! Guess the secret number from 0 to 100");
        Scanner scan = new Scanner(System.in);
        String cr;
        int number;
        int s_number = (int) (Math.random() * 101);
        int count = 0;
        boolean condition = true;


        while (condition) {
            System.out.println("Enter a number:");
            try {
                cr = scan.next();
                number = Integer.parseInt(cr.trim());
                System.out.println(number);
            } catch (Exception ex1) {
                System.out.println("incorrect input");
                continue;
            }
            count++;
            if (number < 0) {
                System.out.println("The entered value is negative. valid input from 0 to 100");
            } else if (number > s_number) {
                System.out.println("Your number is BIGGER than mine");
            }
            if (number < s_number && number >= 0) {
                System.out.println("Your number is LESS than mine");
            }
            if (number == s_number) {
                condition = false;
                System.out.println("You won!\n The number of your attempts=" + count);
            }
            if (condition) {
                System.out.println("If you want to continue press any key\nEnter 's' - if you want to stop!");
                String ln;
                ln = scan.next();
                if (ln.equals("s")) {
                    condition = false;
                    System.out.println("Game stopped");
                }
            }

        }

    }

}