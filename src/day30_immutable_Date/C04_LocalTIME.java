package day30_immutable_Date;

import java.time.LocalTime;

public class C04_LocalTIME {
    public static void main(String[] args) throws InterruptedException {
        LocalTime time1 = LocalTime.now();
        System.out.println(time1);//12:34:59.112033900

        Thread.sleep(3000);//
        time1 = LocalTime.now();
        System.out.println(time1);//12:46:55.755711500

        /* bizim olusturdugumuz date ve time canli saat veya tarih degildir
        LocalTime.now(); kullandigimiz satirda o anki tarih veya saati alip bizim variable'imiza store eder
        time1 variable'inin degeri sabittir
         */
        System.out.println(time1.getHour());//20
        System.out.println(time1.getSecond());//12 sayiyeyi verdi

        System.out.println(time1.plusSeconds(1000));// 20:33:17.459293  SAYIYE SONRA SAAT KAC OLUR
        //yada minus degerlerine de bakilabilir


    }
}
