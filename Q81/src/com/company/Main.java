package com.company;

public class Main {

    public static void main(String[] args) {
        sifre("Gökçe","965");

    }
    public static void sifre(String name , String number){
        String sum="";
        sum=name.substring(0,1)+name.substring(name.length()-1)+number.substring(number.length()-2);
        System.out.println(sum);
    }
}
