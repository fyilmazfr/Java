package EKSTRA_SORULAR;

import java.util.Scanner;

public class C15 {// Bu örneğimizde Diziler 3 sayısının KatlarınıYazdıracağız

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi= scan.nextInt();
        for (int i = 0; i <100 ; i++) {
            if (i%3==0){
                System.out.print(i+",");

        }

        }



    }
}
