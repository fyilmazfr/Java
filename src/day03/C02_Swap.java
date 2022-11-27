package day03;

public class C02_Swap {//soru 1 verilen sayi1 VE SAYI2 VARIABLElarin degerlerini degistirin(SWAP) bir program yaziniz

    public static void main(String[] args) {
        int sayi1=10;
        int sayi2=20;
        int sayi3=0;
        System.out.println("swap oncesi : "+sayi1+" "+sayi2);

        sayi3=sayi2;
        sayi2=sayi1;
        sayi1=sayi3;
        System.out.println("swap sonrasi : "+sayi1+" "+sayi2);



    }
}
