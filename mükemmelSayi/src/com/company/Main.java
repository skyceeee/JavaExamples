package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int number;
    int total=0;
    Scanner input=new Scanner(System.in);
        System.out.println("Enter an integer number.");
        number=input.nextInt();
        for(int i=1;i<number;i++){
            if(number%i==0){
                total=total +i;

            }
        }
     if(number==total){
         System.out.println("Number is perfect number");
     }
     else {
         System.out.println("Number is not perfect number");
     }
    }
}
