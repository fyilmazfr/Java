package day06_concatenation;

public class C02_Concatenation {
    public static void main(String[] args) {
        String str1="java";
        String str2="Guzeldir";
        int sayi1=5;
        int sayi2=4;
        // YUKARIDAKI VARIABLESLARI KULLANARAK ISTENEN METINLERI YAZDIRALIM
        System.out.println(str1+" "+str2 +" "+sayi1+sayi2);   // java guzeldir54
        System.out.println(str1+" "+str2+" "+(sayi1+sayi2));  // java guzeldir 9
        System.out.println(sayi1+sayi2+" "+str1);  // 9 JAVA
        System.out.println(""+sayi1+sayi2+" " +str2);// 54 guzeldir   // concatenation ekledik basa yani hiclik yani
        // 5 ve 4'u toplamadi onun yerine yanyana yazdirdi
        System.out.println(str1.concat(str2)); // javaGuzeldir
        System.out.println(str1.concat(" ").concat(str2));  // java guzeldir , concat yaparak ustte ve altta kisayolla
        // birlestirme yaptik


    }
}
