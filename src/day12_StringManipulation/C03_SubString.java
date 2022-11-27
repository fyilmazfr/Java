package day12_StringManipulation;

public class C03_SubString {
    public static void main(String[] args) {
        String isim="Suleyman";
        String soyisim="Karanfil";
        String kartNo="1234 5678 1234 1234";

        // SORU isim ve soy ismin ilk harfi buyuk harf geriye kalanlari * gorunsun
        // kredi kartinin ilk 4 rakami gorunsun geriye kalani * gorunsun

       String isimilkharf=isim.substring(0,1).toUpperCase();
       String isimgeriyekalanlar=isim.substring(1).replaceAll("\\w","*");
        System.out.println(isimilkharf+isimgeriyekalanlar);

        String soyisimilkharf=soyisim.substring(0,1).toUpperCase();
        String soyisimgeriyeKalanlar=soyisim.substring(1).replaceAll("\\w","*");
        System.out.println(soyisimilkharf+soyisimgeriyeKalanlar);

        String kart=kartNo.substring(0,5);
        String kartnoGeriyeKalanlar=kartNo.substring(5).replaceAll("\\d","*");
        System.out.println(kart+kartnoGeriyeKalanlar);


    }
}
