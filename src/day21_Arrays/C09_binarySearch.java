package day21_Arrays;

import java.util.Arrays;

public class C09_binarySearch {//binary search metodu siralanmis array'de aradigimiz elementin index'ini dondurur
    //ya aradigimiz element array'de yoksa?
    //(string'de indexof bize olmayan elementler icin -1 donduruyordu.)
    //aradigimiz element array'de yoksa java olmadigini hemde olsaydi nerede olacagini bize dondurur
    //olmadigi ifade icin eksi kullanir olsaydi nerede olacagini belirtmek icin index degil
    //siralama kullanir
    //binery search "yok ama olsaydi surda olurdu " diye bize yer gosterir
    public static void main(String[] args) {
        int[]sayilar={3,7,15,4,27,10};
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar)); // [3, 4, 7, 10, 15, 27] sayilar siralandi sort methodu sayesinde
        //simdi yeni sairaya gore bakar
        System.out.println(Arrays.binarySearch(sayilar,7));// 2 dondurur
        System.out.println(Arrays.binarySearch(sayilar,4));//1 dondurur ,,once arrayi yaz sonra aradigin elementi
        System.out.println(Arrays.binarySearch(sayilar,-100));//-1 dondurur
        System.out.println(Arrays.binarySearch(sayilar,15));//2
        System.out.println(Arrays.binarySearch(sayilar,6));//-3 dondurur
        System.out.println(Arrays.binarySearch(sayilar,11));//-5 dondurur.
        //(yok olanlara eksi isareti koyar)





    }


}
