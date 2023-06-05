package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*int f1=1;
    int f2=1;
    int sum=0;
    for(int i=0;i<5;i++){
        System.out.println(f1);
         sum=f1+f2;
        f1=f2;
        f2=sum;

    }*/
       // System.out.println(fibo(7));
        fibo(5,9);
    }
    /*public static int fibo(int n){
        if(n==1 || n==2)
            return 1;
        return fibo(n-1)+fibo(n-2);



    } */

    static void fibo(int  num1,int num2 ){
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter two integer");
        num1=scan.nextInt();
        num2=scan.nextInt();
        int f1=1,f2=1;
        int sum=0;
        for(int i =num1;i<=num2-num1;i++){
            sum=f1+f2;
            f1=f2;
            f2=sum;

            System.out.print(f1+" ");

        }



    }

}
