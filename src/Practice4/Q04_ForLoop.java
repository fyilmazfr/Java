package Practice4;

public class Q04_ForLoop {/*
        100 den 0 a kadar 13 e tam bolunebilen sayilari ekrana yaziniz(buyukten kucuge)
        ekran ciktisi asagidaki sekilde olsun ayrica sonrasinda bu sayilarin toplamini da yazdirin istenen sonuc
        91
        78
        65
        52
        39
        26
        13
         */

    public static void main(String[] args) {
        int toplam=0;
        for (int i = 100; i >0 ; i--) {
            if (i%13==0){

                System.out.println(i);

                toplam+=i;
            }


        }
        System.out.print(toplam);
    }
}
