package EKSTRA_SORULAR;

import java.util.Scanner;

public class C05 {//bir cümleyi nasıl boşluksuz bir şekilde yazabileceğimiz göstemerye çalışacağım.

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
        String girilenCumle= scan.nextLine();
        System.out.println(girilenCumle.replaceAll("\\s",""));

    }
}
