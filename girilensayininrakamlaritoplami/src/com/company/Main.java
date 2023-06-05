package com.company;



import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number,digit,sum=0;
        System.out.println("Enter the number:");
        number=sc.nextInt();
        while (number > 0){
            digit = number % 10;
            sum += digit;
            number=number/10;


        }
        System.out.println("Sum of digits: "+sum );
    }
}