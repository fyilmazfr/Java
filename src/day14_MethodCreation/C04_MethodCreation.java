package day14_MethodCreation;

public class C04_MethodCreation {// input olarak verilen isim ve soyismini ilk harfi buyuk
    // geriye kalan * olacak sekilde yazdirin return olacak sekilde dondur

    public static void main(String[] args) {

        String isim="Enes";
        String soyIsim="Bozkurt";

        String gizliIsim=isimGizle(isim,soyIsim);
        System.out.println(isim+" "+soyIsim);
        System.out.println(gizliIsim);

    }

    public static String isimGizle(String isim, String soyIsim) {
        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
        soyIsim=soyIsim.substring(0,1).toUpperCase()+soyIsim.substring(1).replaceAll("\\w","*");

        System.out.println( "isim : " + isim +"\nsoyisim : "+ soyIsim);

        return isim+" " +soyIsim;

    }

}
