package com.company;

public class Main {

    public static void main(String[] args) {
        int even=0;
	for(int i=0;i<10;i++){
        int random=(int)(Math.random()*10+1);
        if(random%2==0){
            even++;
            System.out.println(random);
        }
    }
        System.out.println("Even number : "+even);
    }
}
