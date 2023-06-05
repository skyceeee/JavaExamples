package com.company;

public class Main {

    public static void main(String[] args) {

        harf('a');

    }

    public static  void harf(char ch){
        String mesaj = "Her şey güzel olacak";
        int harf= 0;

        for (int i = 0; i < mesaj.length(); i++) {
            if (mesaj.charAt(i) == ch)
                harf++;

        }System.out.println("Harf sayısı: "+harf);
        


    }
}
