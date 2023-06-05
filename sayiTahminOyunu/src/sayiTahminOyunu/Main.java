package sayiTahminOyunu;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Random rand=new Random();
		System.out.println("**********Oyun bilgileri********** \nKırmızı: Sayı ve tahmininiz arasındakı fark 10'dan az.\nSarı: Sayı ile tahmininiz arasındaki fark 40 ise \nYeşil: Sayı ile tahmininiz arasındaki fark 40'dan fazla.");
		
		int sayi=rand.nextInt(100);
		while(true) {
			System.out.println("Lütfen 1-100 arasında bir sayı giriniz.");
			int tahmin=scan.nextInt();
			if(tahmin>100||tahmin<0) {
				System.out.println("Lütfen geçerli bir tahminde bulununuz.");	
			}else {
				break;
			}
			if(sayi-tahmin<10||tahmin-sayi<10) {
				System.out.println("KIRMIZI");
			}else if(sayi-tahmin<40||tahmin-sayi<40) {
				System.out.println("SARI");
			}else if(sayi-tahmin<100||tahmin-sayi<100) {
				System.out.println("YEŞİL");
			}else {
				System.out.println("Tebrikler...Tahmininiz doğru.Doğru sayı: "+sayi);
			}
			
			
			
		}
		

	}

}
