package day10_StringManipulation;

public class C05_length {
    public static void main(String[] args) {

        String str="Java ogren ,isi kap";
        // BU cumlenin karakter sayisini yazmadan java bize nasil verir?


        System.out.println(str.length()); // TOPLAM Karakter sayisini verir,
        // ayrica buraya char yapmayiz cunku son
        // karaktere ihtiyacimiz yok

        System.out.println(str.charAt(str.length()-1));// sondan 1 KARAKTERI bize verir,
        //str.length()-1 BIze son indexi verir

        System.out.println(str.charAt(str.length()-3));


        String str2=""; // str2 ye bir deger atanmismidir? evet
        // BU DEGER NEDIR? hiclik

        String str3=null;  // STR 3 e bir deger atanmismidir HAYIR ,null bu deger atamamayi isaret etmektedir

        System.out.println(str2.length()); // 0 verir hiclik degerinin bir uzunlugu olmaz ,
        //// fakat str2de bir deger vardir
        System.out.println(str3.length()); //java bize bir deger atanmamis ki nasil uzunlugu olsun diyecektir
        //ve exception verir



    }
}
