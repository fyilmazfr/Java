package day04;

public class C05_Pre_Post_Increment {// pre veya post increment/decrement sadece ++ ve -- islemi icin gecerlidir
    //Bu iki islem icin sayidan sonra veya once yazilmasina gore farkli iki isleyis olur
    public static void main(String[] args) {
        int sayi1=10;
        int sayi2=sayi1++;    // SAYI2 degeri bir artirilacak 11 OLDU
        int sayi3=sayi2++;
        System.out.println(sayi3);
        // BU CLASI DEFTERE YAZDIM BURAYA COK YAZMADIM!!!!!!!!!!!!!!!!!

    }
}
