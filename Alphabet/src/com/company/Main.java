package com.company;

public class Main {

    public static void main(String[] args) {
        char last='Z',begin='A';
        for(int i=0;i<7;i++){
            for(int j=0;j<=i;j++){
                System.out.print(begin+" ");
                begin++;
            }
         begin='A';


            System.out.println("");
        }
    }
}
