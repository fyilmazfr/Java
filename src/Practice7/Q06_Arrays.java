package Practice7;

import java.util.Arrays;
import java.util.Scanner;

public class Q06_Arrays {/* kullanicinin girdigi bir array'in en buyuk elemani ile en kucuk elemaninin
farkini bulan bir method create ediniz */

    public static void main(String[] args) {

        farkiniBul();
    }

   public static void farkiniBul() {
       Scanner scan=new Scanner(System.in);
       System.out.println("array uzunlugunu giriniz");
       int uzunluk= scan.nextInt();
       int arr[]=new  int[uzunluk];

       for (int i = 0; i <uzunluk ; i++) {
           System.out.println("array'in "+(+i+1) + ".elemanini giriniz :");// i den baslatmadik cunku
           // array'in 0'inci elemani olmaz
           arr[i]= scan.nextInt();// for'i den gelen indexler,bu satirda kullanici tarafindan dongu bitene kadar girilen elemanlar okunur
       }
       Arrays.sort(arr);//siaraladik cunku en buyuk eleman sonda kalacak
       System.out.println("array'deki en buyuk eleman ile en kucuk eleman arisindaki fark :"+ (arr[uzunluk-1]-arr[0]));

    }
}
