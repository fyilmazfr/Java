package Java103104105Practice;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Arrays3 {

   /*
   kullanicidan alinan bir string'de sesli harfleri konsola yazdiriniz
    */
   public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       System.out.println("lutfen bir string giriniz");
       String str= scan.nextLine();
       String sesliHarf="aeiou";


       sesliHarfyazdirma(str,sesliHarf);
   }

    public static void sesliHarfyazdirma(String str, String sesliHarf) {

        String arr[] = str.split("");
       // System.out.println(Arrays.toString(arr));





        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase("a" ) ||
            arr[i].equalsIgnoreCase("e" ) ||
             arr[i].equalsIgnoreCase("i" ) ||
             arr[i].equalsIgnoreCase("o" )) {
                System.out.print(arr[i]);

            }
        }
    }
}










