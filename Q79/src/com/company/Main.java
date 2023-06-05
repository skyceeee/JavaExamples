package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("f(x,y)=2x^3-3y^2+5x-25= "+fonksiyon(3,7));

    }
    public static int fonksiyon(int x,int y){
        int sonuc=2*x*x*x-3*y*y+5*x-25;
        return sonuc;

    }
}
