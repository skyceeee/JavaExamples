package com.company;

public class Main {

    public static void main(String[] args) {
        double sum=0;
	for(int i=0;i<10;i++){
        int random=(int)(Math.random()*10+1);
        System.out.printf("%-5d",random);
        sum+=random;

    }
    double avarege=sum/10;
        System.out.println("");
        System.out.println("avarege: "+sum/10);
    if(avarege<5){
        System.out.println("Avarege is less than 5");
    }
    else{
        System.out.println("Avarege is bigger than 5");
    }
    }
}
