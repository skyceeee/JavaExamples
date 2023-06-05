package com.company;

public class Main {

    public static void main(String[] args) {
        int max=0;
	for(int i=0;i<10;i++){
        int random=(int)(Math.random()*21+1);
        System.out.printf("%-5d",random);
        if(random>max)max=random;

    }
        System.out.println("");
        System.out.println("Maximum number is "+max);
    }
}
