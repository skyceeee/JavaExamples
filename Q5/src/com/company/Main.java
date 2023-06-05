package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
        System.out.println("Enter two positive integer:");
        int input1=scan.nextInt();
        int input2=scan.nextInt();
        if(input1<0&& input2<0){
            System.out.println("Enter two positive integer again");
        }
        if(input1-input2<0){
            System.out.println("Negative");
        }
        else if(input1-input2==0){
            System.out.println(input1+"-"+input2+"=0");
        }
        else{
            System.out.println("Positive");
        }
    }
}
