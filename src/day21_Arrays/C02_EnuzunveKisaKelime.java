package day21_Arrays;

public class C02_EnuzunveKisaKelime {/*verilen bir string bir array'de en uzun ve en kisa String'leri
    yazdiran bir method olusturun*/

    public static void main(String[] args) {
        String[ ] isimler={"erdal","onur","mehmet","hayrullah","mihrican"};
        enuzunveKisayiYazdir(isimler);

    }

    public static void enuzunveKisayiYazdir(String[] isimler) {
        String enUzunKelime=isimler[0];// 0'inci Stringi atadik
        String enKisaKelime=isimler[0];
        for (int i = 1; i < isimler.length; i++) {// iki tane sart olusturcaaz
            if (isimler[i].length()>enUzunKelime.length()){// isimlerin i'inci elementinin length'i en uzun kelimenin
                //length'in den buyukse, burda suanlik en zun kelime 0 inci index ,yani erdal
                enUzunKelime=isimler[i];//EGER YUKARDAKI SART SAGLANDIYSA i elementini en uzun kelime ye ata.
                if (isimler[i].length()<enKisaKelime.length()){
                    enKisaKelime=isimler[i];
                }

        }


        }
        System.out.println("array'deki en uzun kelime:"+enUzunKelime);
        System.out.println("Array'deki en kisa kelime:"+enKisaKelime);
    }

}
