package odev;

import java.util.Scanner;

public class odev1 {

	public static void main(String[] args) {

		/*
		 10 ��renci tan�mlanacak bir method yaz.
		  10 ��renciye random not atayacak bir method tan�mla.(0,100)
		  notlar�n kar��l�klar�;
		  90-100==AA
		  85-90==BA
		  70-85==BB
		  60-70==CC
		  50-60==DD
		  0-50==FF(ba�ar�s�z)
		  
		 */
		String[]ogrenciler=ogrenciler(10);
		int[][]notlar=notlar();
		average(notlar);
		display�nfo(ogrenciler, notlar);

	}
	public static String[] ogrenciler(int a) {
		Scanner scan=new Scanner(System.in);
		String [] ogrenci=new String[a];
		System.out.println("��renci bilgilerini giriniz");
		for (int i=0;i<ogrenci.length;i++) {
			System.out.println(i+1+". ��rencinin ad�:");
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
		String[]ge�meDurumu=new String[notlar.length];
		double[] ogrenciOrtalamas� = new double[notlar.length];
		for(int i=0; i<notlar.length;i++) {
			ogrenciOrtalamas�[i]=notlar[i][0]*30/100+notlar[i][1]*70/100;
		
		
		if(ogrenciOrtalamas�[i]>=90&&ogrenciOrtalamas�[i]<=100) {
			harfler[i]="AA";
		}
		else if(ogrenciOrtalamas�[i]>=85&&ogrenciOrtalamas�[i]<=90) {
			harfler[i]="BA";
		}
		else if(ogrenciOrtalamas�[i]>=70&&ogrenciOrtalamas�[i]<=85) {
			harfler[i]="BB";
		}
		else if(ogrenciOrtalamas�[i]>=60&&ogrenciOrtalamas�[i]<=70) {
			harfler[i]="CC";
		}
		else if(ogrenciOrtalamas�[i]>=50&&ogrenciOrtalamas�[i]<=60) {
			harfler[i]="DD";
		}
		else {
			harfler[i]="FF";
		}
		
		if(harfler[i].equals("FF")) {
			ge�meDurumu[i]="Ba�ar�s�z...:(";
		}
		else {
			ge�meDurumu[i]="Ba�ar�l�..";
		}

		}
		
	}
	public static void display�nfo(String[]ogrenciler,int[][] notlar) {
		String[]harfler=new String[notlar.length];
		String[]ge�meDurumu=new String[notlar.length];
		double[] ogrenciOrtalamas� = new double[notlar.length];
		for(int i=0; i<notlar.length;i++) {
			ogrenciOrtalamas�[i]=notlar[i][0]*30/100+notlar[i][1]*70/100;
		
		
		if(ogrenciOrtalamas�[i]>=90&&ogrenciOrtalamas�[i]<=100) {
			harfler[i]="AA";
		}
		else if(ogrenciOrtalamas�[i]>=85&&ogrenciOrtalamas�[i]<=90) {
			harfler[i]="BA";
		}
		else if(ogrenciOrtalamas�[i]>=70&&ogrenciOrtalamas�[i]<=85) {
			harfler[i]="BB";
		}
		else if(ogrenciOrtalamas�[i]>=60&&ogrenciOrtalamas�[i]<=70) {
			harfler[i]="CC";
		}
		else if(ogrenciOrtalamas�[i]>=50&&ogrenciOrtalamas�[i]<=60) {
			harfler[i]="DD";
		}
		else {
			harfler[i]="FF";
		}
		
		if(harfler[i].equals("FF")) {
			ge�meDurumu[i]="Ba�ar�s�z...:(";
		}
		else {
			ge�meDurumu[i]="Ba�ar�l�..";
		}

		}
		
		System.out.println("*************************************************");
		System.out.println("��RENC�LER\t\tV�ZE\tFinal\t\tOrtalama\t\tBa�ar� Durumu\t\tHARF");
		for(int i=0; i<ogrenciler.length;i++) {
			System.out.print(ogrenciler[i]+"\t"+notlar[i][0]+"\t"
		+notlar[i][1]+"\t"+ogrenciOrtalamas�[i]+"\t"+ge�meDurumu[i]+"\t"+harfler[i]);
			System.out.println();
		}
	}

}
