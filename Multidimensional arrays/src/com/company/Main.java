package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    int row,column;
        System.out.println("Please enter row and column");
        row= scan.nextInt();
        column= scan.nextInt();
        int[][] matrix=new int[row][column];
        for(int i=0;i<row;i++){
            System.out.println("Enter "+column+" integer");
            for(int j=0;j<column;j++){
                matrix[i][j]= scan.nextInt();

            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.printf("%-3d",matrix[i][j]);
            }
            System.out.println();
        }
        if(isMagic(matrix)){
            System.out.println("Your matrix is a magic matrix.");
        }else{
            System.out.println("Your matrix is not magic matrix.");
        }
    }
    public static boolean isMagic(int[][] arr) {
        boolean x = false;
        int rows=arr.length;
        int columnn=arr[0].length;


        if (rows != columnn) {
            return x;

        }
        int sumRow, sumColumn, sumDio1 = 0, sumDio2 = 0;
        for (int i = 0; i < arr.length; i++) {
            sumDio1 += arr[i][i];
            sumDio2 += arr[i][2 - i];
        }
            if(sumDio1!=sumDio2) {
                return x;
            }
            for(int i=0;i<arr.length;i++){
                sumColumn=0;
                sumRow=0;
                for(int j=0;j<arr[0].length;j++){
                    sumColumn+=arr[j][i];
                    sumRow+=arr[i][j];
                }
                if(sumColumn!=sumRow||sumColumn!=sumDio2){
                    return x;
                }



            }
        x=true;
        return x;


    }
}
