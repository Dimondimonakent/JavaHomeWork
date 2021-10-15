package com.pb.zelenskyi.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int operand1 = 0;
        int operand2 = 0;
        String sign;
        int result;

        System.out.println("Enter first number");
        try {
            operand1=scan.nextInt();
        }
        catch (Exception ex1){
            System.out.println("Wrong symbol");
            return;
        }
        System.out.println("Enter second number");
        try {
            operand2=scan.nextInt();
        }
        catch (Exception ex2){
            System.out.println("Wrong symbol");
            return;
        }
        System.out.println("Enter symbol of operation (+,-,*,/)");
        sign= scan.next();

        switch (sign){
            case "+":
                result=operand1+operand2;
                System.out.println("Result="+result);
                break;
            case "-":
                result=operand1-operand2;
                System.out.println("Result="+result);
                break;
            case "*":
                result=operand1*operand2;
                System.out.println("Result="+result);
                break;
            case "/":
                try {
                    result=operand1/operand2;
                }
                catch (ArithmeticException ex3 ) {
                    System.out.println("Cannot be divided by 0");
                    return;
                }
                System.out.println("Result="+result);
                break;
            default: System.out.println("Wrong symbol");
        }

    }
}
