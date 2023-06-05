package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
    int number;
    boolean isprime=true;
    do {
        System.out.println("Enter a number:");
        number = input.nextInt();
    }
        while(number<2);
        for(int i=2;i <number;i++) {
            if (number % i == 0) {
                isprime = false;
                break;
            }
        }
        if(isprime){
                System.out.println("Number " +number+" is prime");

            }
        else{
            System.out.println("Number "+number+" is not prime");
        }

    }
}
