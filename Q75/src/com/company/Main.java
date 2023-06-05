package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int random = (int) (Math.random() * 100 + 1);
        Scanner scan = new Scanner(System.in);
        boolean ist=true;
        while(true){
        System.out.println("Enter a number(1-100)");
        int user = scan.nextInt();
        System.out.println(guess(random,user));}

    }

    public static boolean guess(int random, int user) {
        boolean x=true;


        while (x) {
            if (user > random) {
                System.out.println("your guess is so high");
                x = false;

            } else if (user < random) {
                System.out.println("Your guess is so low");
                x = false;

            } else {
                System.out.println("Your guess is correct");
                x = true;
                break;

            }

        }return x;
    }
}


