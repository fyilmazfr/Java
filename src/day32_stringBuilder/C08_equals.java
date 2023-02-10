package day32_stringBuilder;

public class C08_equals {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("Java");
        StringBuilder sb2=new StringBuilder("Java");
        String str="Java";

        System.out.println(sb1.equals(sb2));// false
        System.out.println(sb1.equals(sb1));//true
        // stringBuilder da equals method'u ancak ayni obje olursa true doner
        //String'deki gibi dusunmemek lazim

        System.out.println(sb1.equals(str));//false



        System.out.println(sb1.compareTo(sb2));//0

        StringBuilder sb3=new StringBuilder("Jave");
        System.out.println(sb1.compareTo(sb3));//-4
        // compareTo() iki string builder i bastan baslayarak harf harf karsilastirir
        //ilk harf ayni ise ikincilere gecer
        //ikinciler ayni ise UCUNCULERE  gider
        //farkli olan iki harfin asci kodlari arasindaki farki verir
        //eger hic farkli harf yoksa sonuc olarak 0 dondurur


        sb1.setCharAt(0,'k');
        System.out.println(sb1);//kava
    }
}
