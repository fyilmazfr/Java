package Practice5;

import java.util.Scanner;

public class Q02_FoorLoop {//kullanicidan birden buyuk bir tamsayi girmesini isteyiniz
    // ve 1 den girilen tamsayiya kadar olan sayilarin karelerinin toplamini hesaplayan kodu yaziniz

    // girilen sayi=4
    // kareler toplami=14
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen bir tam sayi giriniz");
        int sayi= scan.nextInt();



        int toplam=0;
        if (sayi>0)

        for (int i = 1; i <sayi ; i++) {
            toplam+=(i*i);

        }
        System.out.println(toplam);
    }
}
