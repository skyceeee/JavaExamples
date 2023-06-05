package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int sayi = input.nextInt();
        System.out.println(sayi + " sayısının Fibonacci Serisi:");
        int s1 = 0, s2 = 1, toplam;
        for (int i = 1; i <= sayi; i++) {
            System.out.print(s1 + " , ");
            toplam = s1 + s2;
            s1 = s2;
            s2 = toplam;
        }
    }
}
