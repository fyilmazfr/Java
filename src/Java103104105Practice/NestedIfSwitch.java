package Java103104105Practice;

import java.util.Scanner;

public class NestedIfSwitch {
    /*
    kullanicidan sifirdan buyuk pozitif bir tamsayi girmesini isteyin
    girilen  pozitif tamsayi 3 basmakli ise ekrana "3 basamakli yazdirin"
    3 basmakli degilse cift olup olmadigini kontrol edin
    cift ise "3 basmakli olmayan cift sayi yazdirin
    cift sayi degilse " 3 basmakli olmayan tek sayi yazdirin"


     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen pozitif bir tamsayi giriniz");
        int sayi = scan.nextInt();

        if (sayi > 0) {
            if (sayi > 99 && sayi < 1000) {
                System.out.println("girilen sayi 3 basamaklidir");
            } else if (sayi % 2 == 0) {
                    System.out.println("3 basamakli olmayan cift sayi");

                }else if (sayi % 2 != 0){
                        System.out.println("3 basmakli olmayan tek sayi");

                }
                }

        else {
            System.out.println("lutfen pozitif bir tam sayi giriniz");
        }

        System.out.println();
        //Tenary ile cozelim
        System.out.println("tenaryn ile cozum");
        String sonuc =(sayi>0 )  ?   (sayi > 99 && sayi < 1000) ? ("3 basamakli 0 dan buyuk sayi") :
                ( sayi % 2 == 0) ?  ("3basmakli olmayan cift sayi") :("3 basamakli olmayan tek sayi"):
                "lutfen 0 dan buyuk bir sayi giriniz";
        System.out.println(sonuc);
    }
}





