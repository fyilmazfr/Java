package OrnekSorularARRAYS_slymn;

import java.util.Arrays;

public class soru5_binarysearch {
    public static void main(String[] args) {
        int[] arr={12,31,43,14};// BINARYSEARCH DEN ONCE MUTLAKA ARRAYS.sort yapilmalidir

        int sayi=43;


        Arrays.sort(arr);// yeni siralama yi bize yapti

        Arrays.binarySearch(arr,sayi);// bu sekilde yaparsak java bize istenen elemanin indexi'ni verir fakat biz bunu bir indexe atarsak

        int idx1=Arrays.binarySearch(arr,sayi); // yeni ir index olusturduk ve atadik , java bize bu sayede index'de bulunan degeri yazdiracak

        System.out.println(idx1);

        int sayi2=58;
        int idx2=Arrays.binarySearch(arr,sayi2);
        System.out.println(idx2);
        //ARADIGIMIZ ELEMAN YOKSA - sonuc verecekti ve olsaydi surda olurdu diye LENGTH verecekti
    }
}
