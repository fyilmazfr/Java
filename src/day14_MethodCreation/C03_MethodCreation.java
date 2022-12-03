package day14_MethodCreation;

public class C03_MethodCreation {// input olarak verilen isim ve soyismini ilk harfi buyuk geriye kalan * olacak sekilde

    // I***** K*****YAZDIRAN BIR METHOD OLUSTURUN
    public static void main(String[] args) {

        String isim = "fatih";
        String soyIsim = "Bozkurt";

        isimgizle(isim, soyIsim);

    }

    public static void isimgizle(String isim, String soyIsim) {

        isim = isim.substring(0, 1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*");
        soyIsim = soyIsim.substring(0, 1).toUpperCase() + soyIsim.substring(1).replaceAll("\\w", "*");

        System.out.println("isim:" + "\n" + "soyIsim:" + soyIsim);
    }
}
