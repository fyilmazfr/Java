package day10_StringManipulation;

public class C01_ChartAt {
    public static void main(String[] args) {
        String str="Java ogrenmek ne guzel";
        System.out.println(str.charAt(0)); // ilk harfi buyuk yazdirmak icin CHART AT ALDIK

        System.out.println(str.toUpperCase().charAt(7)); //  once to uppercase i ekledik,harfi buyuk yapmak icin sonra
        //7 yazdik yedinci karakteri almak icin bu karakter R dir.

        System.out.println(str.charAt(21)); // MESELA son harfi alalim ve calistiralim.bu l dir , bu sefer harfleri
        //buyutmedik.


        // PEKI BIZ ;
        System.out.println(str.charAt(22)); // dersek ne olur?
        // sistem bize hata verir senin verdigin degerler index sinirlarinin disinda uyarisi verir


        // son harfi bulmak icin str in uzunlugunun 1 eksigini index olarak gireriz(22-1)
        // eger index uzunlugu veya daha bir baska sayiyi girersek java bize exception verir
        // charAt kullandigimizda sonuc char olacagi icin artik manipulation yapamayiz. String metodlarindan kullanmamiz
        // gereken bir method varsa charAt den once kullanmaliyiz





    }
}
