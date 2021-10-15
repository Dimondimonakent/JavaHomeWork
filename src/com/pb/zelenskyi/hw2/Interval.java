package com.pb.zelenskyi.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cufra = 0;
        System.out.println("Enter number");
        try {
            cufra = scan.nextInt();
        } catch (Exception ex1) {
            System.out.println("Wrong symbol");
            return;
        }
        if (cufra<0){
            System.out.println("Negative meaning");
        }
        else if (cufra>=0&&cufra<=14){
            System.out.println("Range [0 -14]");
        }
        else if (cufra>14&&cufra<=35){
            System.out.println("Range [15 -35]");
        }
        else if (cufra>35&&cufra<=50){
            System.out.println("Range [36 -50]");
        }
        else if (cufra>50&&cufra<=100){
            System.out.println("Range [51 -100]");
        }
        else System.out.println("Range bigger 100");
    }
}
