package com.company;

public class Main {

    public static void main(String[] args) {
       int maximum= max(12,7);
        System.out.println("Maximum number is "+maximum);
    }
    public static int max(int num1,int num2){
        int max=0;
        if(num1>num2) max=num1;
        else{
            max=num2;
        }
        return max;

    }
}
