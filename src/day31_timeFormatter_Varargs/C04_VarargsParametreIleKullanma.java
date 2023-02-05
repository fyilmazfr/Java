package day31_timeFormatter_Varargs;

public class C04_VarargsParametreIleKullanma {
    public static void main(String[] args) {

            enuzunkelimeyiYazdir(5,"ali","ayse","ismail","ahmet","babayigit");
        }/*
        varargs teorik olarak sonsuz sayida element alabilir ,bir mehod da parametre olarak varrags varsa varargs'in
        sinirlarini bilebilmesi icin parametrelerin sonuncusu olmalidir.
        Oncesinde farkli parametreler olabilir fakat varag'dan sonra parametre OLAMAZ

        BU kuraldan oturu bir method'da sadece 1 tane varargs olabilir
        */


        public static void enuzunkelimeyiYazdir(int kelimesayisi ,String... kelime) {//basa bir int geldi
            String enuzunkelime=kelime[0];
            for (String each:kelime) {

                if (each.length()>enuzunkelime.length()){
                    enuzunkelime=each;
                }

            }
            System.out.println("girilen kelimelerden en uzun olani :"+enuzunkelime);
        }
    }

