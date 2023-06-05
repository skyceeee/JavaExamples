package com.compain;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cube = 0;
        int sum = 0;
        int digit = 0;
        int number = 100;
        int temp=number;
        while (number <= 999) {
            while(temp>0) {

                digit = temp % 10;
                cube = digit * digit * digit;
                sum += cube;
                temp /= 10;



            }
            if (temp == sum) {
                System.out.println(temp);


            }

            sum=0;
            number++;

        }

    }
}



