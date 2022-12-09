package day16_ForLoop;

import java.util.Scanner;

public class C04_ForLoop {// soru 6:kullanicidan 100 den kucuk bir tam sayi isteyin
    // 1 den baslayarak girilen sayiya kadar tum sayilari yazdirin
    //ancak sayi 3 un kati ise "java"
    // sayi 5 in kati ise syi yerine "guzeldir"
    //sayi hem 3 UN hem 5 in kati ise  sayi yerine " java guzeldir yazdirin
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 100 DEN KUCUK BIR SAYI GIRINIZ");
        int sayi= scan.nextInt();

        for (int i = 1; i <=sayi ; i++) {

            if (i%3==0 && i%5==0){
                System.out.print("java GUZELDIR"+"  ");

            }else if (i%5==0){
                System.out.print("guzeldir"+ " ");
            }else if (i%3==0){
                System.out.print("java"+ " ");
            }else
                System.out.print(i+ " ");

        }

    }



}
