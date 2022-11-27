package day03;

public class C03_Swap { //SORU 2 BIR ONCEKI SWAP SORUSUNU BOS KOVA KULLANMADAN YAPIN
    public static void main(String[] args) {
        int sayi1=10;
        int sayi2=20;

        sayi1 =sayi1 +sayi2;
        sayi2 =sayi1 -sayi2;
        sayi1 =sayi1 -sayi2;
        System.out.println("swaptan sonra sayi1="+sayi1+", sayi2="+sayi2);




    }
}
