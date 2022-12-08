package day15_Overloading_forLoop;

public class C05_1_ForLoop {// 10 dahil ve 20 dahil aradaki sayilari toplayin

    public static void main(String[] args) {
        int toplam=0; // for dan once tanimlanmalidir bir nevi baos kasa(toplam) gibi dusun.


        for (int i = 10; i <=20 ; i++) {
            toplam+=i; // bunu yaparak her uygun i degerinden sonra  java kasaya yeni degeri atayacak
        }
        System.out.println("10 20 arasi sayilarin toplami :" +" " +toplam);

    }
}
