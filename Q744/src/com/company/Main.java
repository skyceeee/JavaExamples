package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        System.out.println("Maximum number is : "+max(num1,num2));
         isPositive(max(num1,num2));
    }
    public static int max(int num1,int num2){
        int maximum;

        if (num1>num2){
            maximum=num1;
        }
        else{
            maximum=num2;
        }
        return maximum;

            }

    public static void isPositive(int maximum){
        if(maximum<0){
            System.out.println("Maximum number is negative.");
        }
        else{
            System.out.println("Maximum number is Positive.");


    }
}
}
