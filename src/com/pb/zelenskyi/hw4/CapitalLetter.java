package com.pb.zelenskyi.hw4;

import java.util.Scanner;

public class CapitalLetter {
    public static void main(String[] args) {
        System.out.println("Enter the text");
        String some_str = getString();
        char[] charArray = some_str.toCharArray();
        boolean foundSpace = true;

        for(int i = 0; i < charArray.length; i++) {
            if(Character.isLetter(charArray[i])) {
                if(foundSpace) {
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    foundSpace = false;}
            } else {
                foundSpace = true;}
        }
        some_str = String.valueOf(charArray);
        System.out.println("Interpreted string:\n" + some_str);
    }
    private static String getString() {
        Scanner scan = new Scanner(System.in);
        String some_str1 = scan.nextLine();
        return some_str1;
    }
}
