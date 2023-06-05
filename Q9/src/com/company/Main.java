package com.company;

public class Main {

    public static void main(String[] args) {
        String mesaj = "Programing is the process of creating a set of instructions.";
        int a = 0;
        for (int i = 0; mesaj.length() > i; i++) {
            if ('a' == mesaj.charAt(i)) {
                a++;
            }


        }
        System.out.println(a);
    }
}
