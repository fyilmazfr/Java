package day15_Overloading_forLoop;

public class C05_2_ForLoop { // 30 dahil 50 dahil arada ki cift sayilari toplayin
    public static void main(String[] args) {
        int toplam=0;

        for (int i = 30; i <=50 ; i++) {
            if (i%2==0)// mod 2 yaparak cift sayilari aldim
            toplam +=i;

        }
        System.out.println("30-50 dahil arasi cift sayilarin toplami:"+" "+ toplam);

        // bu sorunun ikinci yontemini bir sonraki class da yapacagim
    }
}
