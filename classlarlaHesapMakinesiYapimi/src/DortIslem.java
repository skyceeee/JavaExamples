
public class DortIslem {
    public int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public int cikar(int sayi1, int sayi2) {
        return sayi1 - sayi2;

    }

    public int carp(int sayi1, int sayi2) {
        return sayi1 * sayi2;
    }

    public double bol(int sayi1, int sayi2) {
        if (sayi2 == 0) {
            System.out.println("Lütfen sıfırdan farklı bir sayı giriniz!!!");
        }
            return sayi1 / sayi2;
    }
}


