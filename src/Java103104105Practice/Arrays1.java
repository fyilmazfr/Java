package Java103104105Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays1 {
    /*
    kullanicidan bir string aliniz
    strind de var olan her karakterin sayisini ekrana yaziniz

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir string giriniz");
        String str = scan.nextLine();
        String[] arr = str.split("");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int counter = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1].equals(arr[i])) {
                counter++;
            }else{
                //System.out.println(arr[i-1]+ "karakter sayisi"+ (counter+1));
                counter=0; //farkli bir karaktere GECTIGIMIZ ICIN COUNTERI sifirla
            }
            System.out.println(arr[i]+" " + "karakterinin sayisi "+(counter+1));
            }


        }
    }
