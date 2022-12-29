package day24_arraylist_forEachLoop;

public class C07_ArraydekiSayilarinKareToplami {
    public static void main(String[] args) {
        int[] sayilar={2,3,4,1,5,7,6,5,4,3};
        int toplam=0;

        for (int each:sayilar
             ) {
            toplam+=each*each;//herbir eachi kenisiyle carp toplama at

        }
        System.out.println("kareler toplami:"+toplam);//kareler toplami:190
    }
}
