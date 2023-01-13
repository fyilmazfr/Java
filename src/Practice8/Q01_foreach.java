package Practice8;

public class Q01_foreach {/*foreach kullanarak cift ve tek sayilari yazdir */

    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8,9,12,14,13,15,18};
        for (int each:arr) {
            if (each%2==0){
                System.out.println("cift arrayler:"+each+" ");
            }

        }
        System.out.println();
        System.out.println("tek sayilar");
        for (int each:arr) {
            if (each%2!=0)
            System.out.println(each+" tek sayilar");

        }
    }
}
