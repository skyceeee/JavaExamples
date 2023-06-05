package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nameAndSurname = "";
        char[] vowel={'a','e','i','o','u','ü','ö','ı'};
        System.out.println("Please enter your name and surname:");
        int vowelNumber=0;
        nameAndSurname = scan.nextLine();

        for (int j = 0; j < vowel.length; j++) {
            for(int k=0;k<nameAndSurname.length();k++){
                if (vowel[j]==nameAndSurname.charAt(k)) {
                vowelNumber++;


            }

            }
         /* char c=nameAndSurname.charAt(j);
          if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='ö'||c=='ü'||c=='ı'){
              vowelNumber++;
          }*/
        }
        System.out.println(vowelNumber);
    }
}
