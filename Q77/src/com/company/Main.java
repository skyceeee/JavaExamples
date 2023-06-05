package com.company;

public class Main {

    public static void main(String[] args) {
        stringMesaj("FENERBAHÇE");

    }
    public static void stringMesaj(String mesaj){

        for(int i=mesaj.length();i>0;i--){
            String subMesaj=mesaj.substring(i-1,i);
            System.out.print(subMesaj);
        }





    }
}
