package com.company;

public class Main {

    public static void main(String[] args) {
        int negativeEven=0;
	for(int i=0;i<10;i++){
        int random=(int)(Math.random()*21-10);
        if(random<0&&random%2==0){
            System.out.println(random);
            negativeEven++;
        }


    }
        if(negativeEven==0){
            System.out.println("Negative even number not found");
        }
    }
}
