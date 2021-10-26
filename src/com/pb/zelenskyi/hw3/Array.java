package com.pb.zelenskyi.hw3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean condition = true;
        int[] array1 = new int[10];
        int[] array2 = array1;
        int count = 0;
        int sum = 0;
        String mas ;
//ввод масива
     /*   for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }*/
        while (condition) {
            System.out.println("Enter 10 positive numbers:");
            try {
                for (int i = 0; i < array1.length; i++) {
                    mas = input.next();
                    array1[i] = Integer.parseInt(mas.trim());
                    condition=false;}
            } catch (Exception ex1) {
                System.out.println("incorrect input");
                continue;
            }}
//вывод первого масива
        System.out.print ("Input array:");
        for (int i = 0; i < array1.length; i++) {
            System.out.print (" " + array1[i]);
        }
        System.out.print ("\n");

        int sort;
        for (int i = array2.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array2[j] > array2[j + 1]) {
                    sort = array2[j];
                    array2[j] = array2[j + 1];
                    array2[j + 1] = sort;
                }
            }
        }
//вывод второго масива
        System.out.print ("Sorted array:");
        for (int i = 0; i < array2.length; i++) {
            System.out.print (" " + array2[i]);
        }
        System.out.print ("\n");

        //сумма первого масива
        for (int i = 0; i < array1.length; i++) {
            sum=sum+array1[i];
            if (array1[i]>0) count++;
        }
        System.out.print ("Sum: "+sum+"\n");
        System.out.print ("Number of positive numbers: "+count+"\n");
    }
}