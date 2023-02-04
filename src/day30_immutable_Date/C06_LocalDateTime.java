package day30_immutable_Date;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class C06_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime tarihSaat=LocalDateTime.now();

        System.out.println(tarihSaat);//2023-02-04T20:22:50.439078700

        System.out.println(tarihSaat.plusMonths(3).plusHours(100));//2023-05-09T00:25:10.903924500
        // 3 ay  100 saat sonra tarih ne olur

        System.out.println(tarihSaat.minusDays(100).plusHours(100));//2022-11-01T00:27:54.134873200
        // minus ve plus bir arada kullanabiliriz
        //100 gun once 100 saat sonra tarih ne olur dedik

    }
}
