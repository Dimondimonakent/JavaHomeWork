package com.pb.zelenskyi.hw4;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter some text");
        char[] str = scan.nextLine().toCharArray();
        System.out.println("Enter some text again");
        char[] str1 = scan.nextLine().toCharArray();
        int count1=0;
        int count2=0;
        count1 = getCount(str, count1);
        count2 = getCount(str1, count2);

        if  (count1 != count2) {
            System.out.println("False");
        } else {

            char[] letters = new char[count1];
            int letters_iterator=0;
            for(int i =0;i<count1;i++){
                char pin=str[i];
                if(!Character.isLetter(pin)){
                    continue;
                }

                if(!letters.equals(pin)){
                    letters[letters_iterator]=pin;
                    letters_iterator++;
                    int countStr1=0;
                    int countStr2=0;
                    for(int y=0;y<str.length;y++){
                        if(str[y]==pin){
                            countStr1++;
                        }
                    }
                    for(int y=0;y<str1.length;y++){
                        if(str1[y]==pin){
                            countStr2++;
                        }
                    }
                    if(countStr1==countStr2){
                    }else{
                        System.out.println("False");
                        return;
                    }
                }
            }
            System.out.println("True");
        }
    }

    private static int getCount(char[] str, int count) {
        for (int i = 0; i < str.length; i++) {
            char letters1 = str[i];
            if (Character.isLetter(letters1)) {
                count++;
            }
        }
        return count;
    }
}
