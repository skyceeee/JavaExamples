package com.company;

public class Main {

    public static void main(String[] args) {
        /*char last = 'J', first = 'A';
        for (int i = 0; i <= last -first; i++) {
            for (int j = 0; j <= i; j++) {

                System.out.print(first + " ");
                first++;

            }


            System.out.println();
        }*/
        char first;
        char end;

        for (first = 'A'; first <= 'J'; first++) {
            for (char char1 = 'A'; char1 <= first; char1++) {
                System.out.print(first + " ");


            }
            System.out.println();


        }
        System.out.println();
    }
}


