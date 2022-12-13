package EKSTRA_SORULAR;

import java.util.Scanner;

public class C20_ForLoop {// kullanicidan 100 ye kadar bir sayi isteyin
    // 3 VE 5 IN KATLARINI YAZDIRIN
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("100 e kadar bir sayi giriniz");
        int num= scan.nextInt();
        for (int i = 1; i <=num ; i++) {
            if (i%3==0 && i%5==0){
                System.out.print(i+",");
            }


        }

    }
}
