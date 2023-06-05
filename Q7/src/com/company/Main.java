package com.company;

public class Main {

    public static void main(String[] args) {
        avarege();

    }
    public static void avarege(){
        double avarege=0;
        int sum=0;
        for(int i=0;i<10;i++){
            int random=(int)(Math.random()*10+1);
            System.out.printf("%-5d",random);
            sum+=random;

        }
        System.out.println("");
        System.out.println("Averege: "+sum/10);
    }
}
