package com.company;

public class Main {

    public static void main(String[] args) {
	int[] fibo=new int[10];
    fibo[0]=1;
    fibo[1]=1;

    for(int i=0;i<8;i++){
        fibo[i+2]=fibo[i+1]+fibo[i];
    }
     for(int i=0; i<fibo.length;i++){
         System.out.printf("%-5d",fibo[i]);
     }
       /* int fibo1=1;
        int fibo2=1;
        for(int i=0;i<10;i++){
            System.out.print(fibo1+" ");
            int toplam=fibo1+fibo2;
            fibo1=fibo2;
            fibo2=toplam;

        }*/
    }
}
