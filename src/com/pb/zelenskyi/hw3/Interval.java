package com.pb.zelenskyi.hw3;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        System.out.println("Enter the number");
        try {
            num = scan.nextInt();
        } catch (Exception ex1) {
            System.out.println("incorrect input");
            return;
        }
        if (num<0){
            System.out.println("The entered value is negative");
        }
        else if (num>=0&&num<=14){
            System.out.println("Interval 0 -14");
        }
        else if (num>14&&num<=35){
            System.out.println("Interval 15 -35");
        }
        else if (num>35&&num<=50){
            System.out.println("Interval 36 -50");
        }
        else if (num>50&&num<=100){
            System.out.println("Interval 51 -100");
        }
        else System.out.println("Number bigger 100");
    }
}
