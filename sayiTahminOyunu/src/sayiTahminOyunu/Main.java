package sayiTahminOyunu;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Random rand=new Random();
		System.out.println("**********Oyun bilgileri********** \nK�rm�z�: Say� ve tahmininiz aras�ndak� fark 10'dan az.\nSar�: Say� ile tahmininiz aras�ndaki fark 40 ise \nYe�il: Say� ile tahmininiz aras�ndaki fark 40'dan fazla.");
		
		int sayi=rand.nextInt(100);
		while(true) {
			System.out.println("L�tfen 1-100 aras�nda bir say� giriniz.");
			int tahmin=scan.nextInt();
			if(tahmin>100||tahmin<0) {
				System.out.println("L�tfen ge�erli bir tahminde bulununuz.");	
			}else {
				break;
			}
			if(sayi-tahmin<10||tahmin-sayi<10) {
				System.out.println("KIRMIZI");
			}else if(sayi-tahmin<40||tahmin-sayi<40) {
				System.out.println("SARI");
			}else if(sayi-tahmin<100||tahmin-sayi<100) {
				System.out.println("YE��L");
			}else {
				System.out.println("Tebrikler...Tahmininiz do�ru.Do�ru say�: "+sayi);
			}
			
			
			
		}
		

	}

}
