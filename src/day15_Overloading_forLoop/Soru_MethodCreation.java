package day15_Overloading_forLoop;

public class Soru_MethodCreation {// veerilen iki sayiyi carpip sonucu bize donduren bir method olusturun

    public static void main(String[] args) {
        int sayi1 = 10;
        int sayi2 = 5;

        int sonuc=carpgetir(sayi1,sayi2);

    }

    public static int carpgetir(int sayi1, int sayi2) {

        System.out.println(sayi1*sayi2);
        return carpgetir(sayi1, sayi2);

    }
}




