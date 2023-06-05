package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//ax^2+bx+c denkleminin diskriminantını bulan programı yazınız
        Scanner scan=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter tree number:");
        a=scan.nextInt();
        b=scan.nextInt();
        c=scan.nextInt();
        System.out.println("The equation= "+a+"x^2+"+b+"x+"+c);
        double discrmnt=(Math.pow(b,2)-4*a*c);
        System.out.println("The equations discriminate is "+discrmnt);
        if(discrmnt<0){
            System.out.println("The equation hasn't reel root.");
        }
        else if(discrmnt==0){
            System.out.println("The equation has equal two root.");
            double roots=(-b-(Math.sqrt(discrmnt))/2*a);
            System.out.println("Roots are "+roots);

        }else{
            System.out.println("The eqution has two root");
            double root1=(-b-Math.sqrt(discrmnt)/2*a);
            double root2=(-b+Math.sqrt(discrmnt)/2*a);
            System.out.println("The roots are "+root1+root2);
        }
    }

}
