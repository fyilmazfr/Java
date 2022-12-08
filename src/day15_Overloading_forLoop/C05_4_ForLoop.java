package day15_Overloading_forLoop;

public class C05_4_ForLoop {// 1500 Ile 1600 sinirlar dahil arasindaki 7 ile bolunebilen sayilari toplayin

    public static void main(String[] args) {
        int toplam=0;
        for (int i = 1500; i <=1600 ; i++) {
            if (i%7==0)
            toplam +=i;

        }
        System.out.println(toplam);
    }

}
