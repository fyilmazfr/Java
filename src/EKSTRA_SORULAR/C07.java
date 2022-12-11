package EKSTRA_SORULAR;

public class C07 {// Bu örneğimizdeAralıktaki Sayılardan Hangilerinin 2 ye Kalanlı Bölündüğünü Bulacağız..0-30 arasi olsun

    public static void main(String[] args) {
        int sayac=0;

        for (int i = 0; i <=30 ; i++) {
            if (i%2!=0){

                sayac=i;
                System.out.print(sayac+" ,");
            }

        }

}}
