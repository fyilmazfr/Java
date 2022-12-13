package EKSTRA_SORULAR;

import java.util.Scanner;

public class C19_ForLoop {//kullanicidan 100 den kucuk bir sayi isteyin 1 den baslayarak girilen sayiya kadar
    // 3 un katlari ise yazdirin
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 100 den kucuk bir sayi giriniz");
        int num= scan.nextInt();
        for (int i = 1; i <=num ; i++) {
            if (i%3==0){
                System.out.print(i+",");
            }

        }
    }
}
