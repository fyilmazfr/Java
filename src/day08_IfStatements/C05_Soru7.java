package day08_IfStatements;

import java.util.Scanner;

public class C05_Soru7 {/*kullanicidan artik yil olup olmadigini  test etmek icin yil girmesini isteyiniz
        1:dort ile bolunemeyen yillar artik yil degildir
        2:dort ile bolunup 100 ile bolunemeyen yillar artik yildir
        3:4un kati olmasini ragmen 100 ile bolunebilen yillardan sadece 400 un kati olanlar artik yildir
         */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir yil giriniz");
        int yil= scan.nextInt();
        if (yil%4!=0){
            System.out.println("artik yil degildir");

        }
        if (yil%100!=0){
            System.out.println("artik yil");
        }
        if (yil%400!=0){
            System.out.println("artik yil");
        }
        else {
            System.out.println("artik yil degildir");
        }
    }
}
