package day31_timeFormatter_Varargs;

public class C03_varargsIleEnUzunKelimeyiYazdirma {
    public static void main(String[] args) {

        enuzunkelimeyiYazdir("ali","ayse","ismail","ahmet");
    }

    public static void enuzunkelimeyiYazdir(String... kelime) {
        String enuzunkelime=kelime[0];  //kelime array'inin 0. elementi en uzun kelimeye esit olsun ,dedik
        for (String each:kelime) {

            if (each.length()>enuzunkelime.length()){
                enuzunkelime=each;
            }

        }
        System.out.println("girilen kelimelerden en uzun olani :"+enuzunkelime);//ismail
    }
}
