package Java103104105Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays4 {
    /*
    KULLANIcinin girdigi bir array'in en buyuk elemani ile en kucuk elemani arasindaki farki bulunuz
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Array'in uzunluk belirleyiniz");
        int uzunluk = scan.nextInt();//burda sadece uzunlugu belirledik ,sonraki asama array'i olusturmak
        int arr[] = new int[uzunluk];//array'i olusturduk

        for (int i = 0; i < uzunluk; i++) {//kullanicinin verdigi uzunluga kadar gidecek
            System.out.println("arrayin " + (i + 1) + " elemanini giriniz");//burda kullaniciyi yonlendiriyoruz, 0.elemanyerine 1.eleman yazdiriyoruz
            arr[i] = scan.nextInt();//kullanicidan aldigimizi arraye koyuyoruz burasi onemli
        }
        Arrays.sort(arr);//siraladik array'i
        System.out.println("array'in en buyuk elemani " + arr[uzunluk-1]);
        System.out.println("array'in en kucuk elemani" +arr[0]);
        System.out.println( arr[uzunluk-1]-arr[0]);


    }
}
