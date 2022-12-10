package day18_While_DoWhileLoop;

import java.util.Locale;

public class C01_WhileLoop {// kullanicidan baslangic ve bitis harflerini alin ve baslangic harfinden baslayip bitis

    //harfinde biten tum harfleri buyuk harf olarak ekrana yazdirin
    //kullanicinin hata yapmadigini farz edin
    public static void main(String[] args) {
        char ilkHarf = 'f';
        char sonHarf = 't';
        char temp = ilkHarf;// ilk harfi bozmamak
        //        icin yaptik
        String buyult;

        while (temp <= sonHarf) {

            buyult=(temp + "").toUpperCase();
            System.out.print(buyult + " ");

            temp += 1;
        }
    }
}