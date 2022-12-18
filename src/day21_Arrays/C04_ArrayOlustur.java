package day21_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_ArrayOlustur {/* KUllanicidan bir arayin boyutunu ve tum elementlerini alarak
    bir aray olusturup bu array i bize donduren bir method olusturun*/

    public static void main(String[] args) {
        int[] sayilar=arrayOlustur();//BIR method olusturmak icin int array olusturduk
        System.out.println(Arrays.toString(sayilar));//en son ekranda girilen index'leri gormek icin sout yaptik
        //[9, 8, 7]
    }
    private static int[] arrayOlustur() {
        Scanner scan=new Scanner(System.in);
        System.out.println("kac elemanli bir aray olusturmami istersiniz");
        int uzunluk=scan.nextInt();//kullanici uzunlugu belirledi
        int[] olusturulan=new int[uzunluk];//belirlenen uzunluk olusturulan int array'e atandi

        for (int i = 0; i < uzunluk; i++) {
            System.out.println(i+".index icin sayi giriniz");//kullanici belirlenen uzunluktaki array'lere sayi atiyor
            olusturulan[i]= scan.nextInt();//atanan sayi her defasinda olusturalan array tepsisine gonder
        }
        return olusturulan;// yukarda sout ile kullanicinin atadigi yeni array tepsisini gormek istersen
        // return atamak zorundasin aksi takdirde sout yazdiramazsin

    }
}
