package day38_Exceptions;

public class C02 {
    public static void main(String[] args) {
        int c = 100;
        int d = 50;
        int sayac = 1;

        while (sayac < 1000) {
            /* try blogu yapmaya calistigimiz ama risk oldugunu dusundugumuz islemleri yazmak icin kullanilir.
            catch'den sonraki parantez karsilasmayi bekledigimizexception turunu javaya soylemek icin kullanilir.
            catch blogu; Java'ya soyledigimiz exception (istisnai durum) gerceklesirse java'nin yapmasini istedigimiz islem.
            catch blogunun onunde ki paranteze karsilasmayi bekledigimiz exception'lari yazabiliriz veya her turlu
            exception'da devreye girmesini istiyorsak tum exceptionlarin parent'i olan EXCEPTION yazabiliriz.
             */
            try {
                System.out.print(c / d);
            } catch (ArithmeticException e) {
                System.out.println("payda sifir oldu dikkat");
            }


            d--;
            sayac++;
        }

    }}