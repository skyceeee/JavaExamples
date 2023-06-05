package odev;

import java.util.Scanner;

public class odev1 {

	public static void main(String[] args) {

		/*
		 10 öðrenci tanýmlanacak bir method yaz.
		  10 öðrenciye random not atayacak bir method tanýmla.(0,100)
		  notlarýn karþýlýklarý;
		  90-100==AA
		  85-90==BA
		  70-85==BB
		  60-70==CC
		  50-60==DD
		  0-50==FF(baþarýsýz)
		  
		 */
		String[]ogrenciler=ogrenciler(10);
		int[][]notlar=notlar();
		average(notlar);
		displayÝnfo(ogrenciler, notlar);

	}
	public static String[] ogrenciler(int a) {
		Scanner scan=new Scanner(System.in);
		String [] ogrenci=new String[a];
		System.out.println("öðrenci bilgilerini giriniz");
		for (int i=0;i<ogrenci.length;i++) {
			System.out.println(i+1+". öðrencinin adý:");
			ogrenci[i]=scan.nextLine();		
		}
		return ogrenci;
		
		
	}
	
	public static int[][] notlar() {
		//0.index vize 1.index final
		int[][]notlar=new int[10][2];
		for(int i=0;i<10;i++) {
			for(int j=0;j<notlar[i].length;j++) {
			notlar[i][j]=(int)(Math.random()*101);
		}
	}
		return notlar;
		
		
	}
	public static void average(int[][] notlar) {
		double sumVize=0;
		double sumFinal=0;
		for(int i=0;i<notlar.length;i++) {
				sumVize+=notlar[i][0];
				sumFinal+=notlar[i][1];
		}
		double averageVize=sumVize/notlar.length;
		double averageFinal=sumFinal/notlar.length;
		System.out.println("Average of vize: "+averageVize);
		System.out.println("Average of final: "+averageFinal);

		
		
	}
	public static void harflendirme(int[][] notlar) {
		String[]harfler=new String[notlar.length];
		String[]geçmeDurumu=new String[notlar.length];
		double[] ogrenciOrtalamasý = new double[notlar.length];
		for(int i=0; i<notlar.length;i++) {
			ogrenciOrtalamasý[i]=notlar[i][0]*30/100+notlar[i][1]*70/100;
		
		
		if(ogrenciOrtalamasý[i]>=90&&ogrenciOrtalamasý[i]<=100) {
			harfler[i]="AA";
		}
		else if(ogrenciOrtalamasý[i]>=85&&ogrenciOrtalamasý[i]<=90) {
			harfler[i]="BA";
		}
		else if(ogrenciOrtalamasý[i]>=70&&ogrenciOrtalamasý[i]<=85) {
			harfler[i]="BB";
		}
		else if(ogrenciOrtalamasý[i]>=60&&ogrenciOrtalamasý[i]<=70) {
			harfler[i]="CC";
		}
		else if(ogrenciOrtalamasý[i]>=50&&ogrenciOrtalamasý[i]<=60) {
			harfler[i]="DD";
		}
		else {
			harfler[i]="FF";
		}
		
		if(harfler[i].equals("FF")) {
			geçmeDurumu[i]="Baþarýsýz...:(";
		}
		else {
			geçmeDurumu[i]="Baþarýlý..";
		}

		}
		
	}
	public static void displayÝnfo(String[]ogrenciler,int[][] notlar) {
		String[]harfler=new String[notlar.length];
		String[]geçmeDurumu=new String[notlar.length];
		double[] ogrenciOrtalamasý = new double[notlar.length];
		for(int i=0; i<notlar.length;i++) {
			ogrenciOrtalamasý[i]=notlar[i][0]*30/100+notlar[i][1]*70/100;
		
		
		if(ogrenciOrtalamasý[i]>=90&&ogrenciOrtalamasý[i]<=100) {
			harfler[i]="AA";
		}
		else if(ogrenciOrtalamasý[i]>=85&&ogrenciOrtalamasý[i]<=90) {
			harfler[i]="BA";
		}
		else if(ogrenciOrtalamasý[i]>=70&&ogrenciOrtalamasý[i]<=85) {
			harfler[i]="BB";
		}
		else if(ogrenciOrtalamasý[i]>=60&&ogrenciOrtalamasý[i]<=70) {
			harfler[i]="CC";
		}
		else if(ogrenciOrtalamasý[i]>=50&&ogrenciOrtalamasý[i]<=60) {
			harfler[i]="DD";
		}
		else {
			harfler[i]="FF";
		}
		
		if(harfler[i].equals("FF")) {
			geçmeDurumu[i]="Baþarýsýz...:(";
		}
		else {
			geçmeDurumu[i]="Baþarýlý..";
		}

		}
		
		System.out.println("*************************************************");
		System.out.println("ÖÐRENCÝLER\t\tVÝZE\tFinal\t\tOrtalama\t\tBaþarý Durumu\t\tHARF");
		for(int i=0; i<ogrenciler.length;i++) {
			System.out.print(ogrenciler[i]+"\t"+notlar[i][0]+"\t"
		+notlar[i][1]+"\t"+ogrenciOrtalamasý[i]+"\t"+geçmeDurumu[i]+"\t"+harfler[i]);
			System.out.println();
		}
	}

}
