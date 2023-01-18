package day21_Arrays;

public class  C01_MaxSayiyiBulma {
    public static void main(String[] args){
        //VERILEN BIR int arraydaki en buyuk sayiyi yazdiran bir method olusturun.
        int []sayilar={3,5,7,1,9,5,2};
        maxSayiyiYazdir(sayilar);
    }

    public static void maxSayiyiYazdir(int[] sayilar) {
        int maxSayi=sayilar[0];//buraya neden deger atatdik?
        //buraya 0'inci indexi atadik cunku ve java her defasinda
        // sayilari kontrol edecek asagidaki forLoop sayesinde
        for (int i = 1; i <sayilar.length ; i++) {//bir ustte i'yi 0 olarak atadigimiz icin for loop da i 1den baslasin
            if (sayilar[i]>maxSayi){// eger sayilarin i'nin indexi maxsayi'dan buyukse
                maxSayi=sayilar[i];//ozaman i'deki index maxsayi olsun,yani yeni degerimiz olsun.
            }
        }
        System.out.println("araydaki en buyuk sayi:"+ maxSayi);// dikkat sout'u forLoop'un disina koymak gerekir
        //aksi takdirde tum ileri yazdirir
    }
}
