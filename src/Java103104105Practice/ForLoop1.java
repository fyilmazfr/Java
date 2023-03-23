package Java103104105Practice;

import java.util.Scanner;

public class ForLoop1 {
    /*
    kullanicidan 100 den kucuk bir tamsayi isteyin
    1 den baslayarak girilen sayiya kadar tum sayilari yazdirin
    ancak;
    sayi 3 un kati ise "java" yazdirin
    5in kati ise guzeldir yazdiirin
    sayi hem 3 un hem 5 in kati ise  "java guzeldir" yazdirin
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi= scan.nextInt();
        for (int i = 0; i <sayi ; i++) {

            if (i%3==0 && i%5==0){
                System.out.print("java"+",");
            }else if (i%5==0){
                System.out.print("guzeldir"+",");
            }else if (i%3==0){
                System.out.print("java guzeldir"+",");
            }else
                System.out.print(i+",");

        }

    }
}
