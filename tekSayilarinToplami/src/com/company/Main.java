package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        int toplam=0;
        while (true) {
            System.out.println("Lütfen bir sayı giriniz.");
            sayi=input.nextInt();
            if(sayi<0){
                System.out.println("Negatif bir sayı girdiniz.Lütfen tekrar deneyiniz.");
                break;
            }
            if(sayi % 2==1){
                toplam+=sayi;
                System.out.println("Girilen sayıların toplamı:"+toplam);
            }


        }

    }
}