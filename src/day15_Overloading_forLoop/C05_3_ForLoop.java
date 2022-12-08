package day15_Overloading_forLoop;

public class C05_3_ForLoop { // 30 dahil 50 dahil arada ki cift sayilari toplayin
    public static void main(String[] args) {
        int toplam=0;
        for (int i = 30; i <=50 ; i+=2) {
            toplam +=i; // bu ifade her bir i degerini toplam a ekle demektir

        }
        System.out.println("30 dahil 50 dahil arada ki cift sayilari toplami :"+ " "+ toplam);
    }
}
