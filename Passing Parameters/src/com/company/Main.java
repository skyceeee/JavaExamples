package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(nPrintln("Welcome to Java",5));
        System.out.println(nPrintln("Compter Science",10));

    }
    public static int nPrintln(String message, int n){
        for(int i=0;i<n;i++){
            System.out.println(message);
        }
        return n;
    }

}
