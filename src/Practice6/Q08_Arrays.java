package Practice6;

import java.util.Arrays;
import java.util.Scanner;

public class Q08_Arrays {/*kullanicidan aldigimiz 8elemanli arrayin icinde kac tane 3'e bolunebilen sayi vardir
negatif sayilarda dahil olsun */

    //ben burda array'in uzunlugunu en basta kendim belirledim

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen sayilardan eleman belirleyiniz");
        int uzunluk = scan.nextInt();//kulanici uzunlugu belirledi
        int[] olusturulan = new int[uzunluk];

        int count = 0;//sayac actim
        for (int i = 0; i < uzunluk; i++) {
            System.out.println(i + ".index icin sayi giriniz");
            olusturulan[i] = scan.nextInt();//atanan her sayiyi olusturulan tepsiye gonderdim

            System.out.println("olusturulan yeni liste :" + Arrays.toString(olusturulan));//arrayleri gormek icin yazdirdim

            if (olusturulan[i] % 3 == 0) {// simdide sarta bakiyorum
                count++;

            }

        }
        System.out.println("3e bolunebilen sayilar :" + count + " adet");


    }
}

