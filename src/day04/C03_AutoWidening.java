package day04;

public class C03_AutoWidening {// OTOMATIK GENISLETME, konteynir
    public static void main(String[] args) {
        //float sayi2=3.4f;
        //double sayi3=sayi2;// java bunu kabul eder cunku float double'a sigar
        byte sayi1=21;
        short sayi2=55;
        int sayi3=sayi1+sayi2;// Java buna itiraz etmez cunku byte ve short int den kucuktur toplam 88 ,veya
        System.out.println(sayi3);
        double sayi4=sayi1+sayi2;
        System.out.println(sayi4);//=sayi1*sayi2;// java bunuda kabul eder ,double hepsinden buyuktur
        double sayi5=sayi4/sayi3;
        System.out.println(sayi5);




    }
}
