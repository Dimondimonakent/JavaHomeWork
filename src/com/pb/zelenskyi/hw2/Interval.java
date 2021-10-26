package com.pb.zelenskyi.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = 0;
        System.out.println("Enter number");
        try {
            number = scan.nextInt();
        } catch (Exception ex1) {
            System.out.println("Wrong symbol");
            return;
        }
        if (number<0){
            System.out.println("Negative meaning");
        }
        else if (number>=0&&number<=14){
            System.out.println("Range [0 -14]");
        }
        else if (number>14&&number<=35){
            System.out.println("Range [15 -35]");
        }
        else if (number>35&&number<=50){
            System.out.println("Range [36 -50]");
        }
        else if (number>50&&number<=100){
            System.out.println("Range [51 -100]");
        }
        else System.out.println("Range bigger 100");
    }
}
