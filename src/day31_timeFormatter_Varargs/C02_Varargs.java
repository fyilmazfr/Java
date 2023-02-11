package day31_timeFormatter_Varargs;

public class C02_Varargs {
    public static void main(String[] args) {
        //verilen iki int'i TOPLAYIP SONUCU YAZDIRAN BIR METHOD OLUSTURUN


        /*normalde bunu her bir int degeri icin bir method olusturup toplama yapmamiz gerekecekti
        FAKAT;
        verilen kac int olursa olsun toplayip yazdiran bir methoda ihtiyacimiz var

         */

        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 30;
        int sayi4 = 40;

        toplaYazdir(sayi1, sayi2, sayi3, sayi4);
        toplaYazdir(sayi1, sayi2, sayi3);
        toplaYazdir(sayi1, sayi2);
    }

    public static void toplaYazdir(int... sayi) {
        /* int...  sayi bu gosterim integer  variable'lardan olusan bir varargs demektir
        varargs array alt yapisini kullanir

         */
        int toplam = 0;
        for (int each : sayi) {
            toplam += each;

        }
        System.out.println("girilen sayilarin toplami :" + toplam);
        /*girilen sayilarin toplami :100
          girilen sayilarin toplami :60
          girilen sayilarin toplami :30

         */
//notlar
// * varrags dan sonra varrangs olmaz cte verir
        //VARRANGS dan sonra parametre olmaz CTE verir
        //varrangs dan sonra

    }
}
