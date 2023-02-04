package day30_immutable_Date;

import java.time.LocalDate;
import java.time.Month;

public class C03_date_time {
    public static void main(String[] args) {
        LocalDate tarih=LocalDate.now();

        System.out.println(tarih);//2023-02-04 VERDI

        System.out.println(tarih.getDayOfYear());//35 YILIN 35 . GUNUNU VERDI
        System.out.println(tarih.getDayOfWeek());//SATURDAY
        System.out.println(tarih.getMonthValue());//2. ay direk subatin karisligini verdi
        System.out.println(tarih.isLeapYear());//false artik yil'mi degil mi bize onu verir

        LocalDate tarih2=LocalDate.of(1988,3,26);
        System.out.println(tarih2);//1988-03-26 VERDI


        LocalDate tarih3=LocalDate.of(1960, Month.JANUARY,3);
        System.out.println(tarih3);//1960-01-03

        System.out.println(tarih.plusDays(100));//2023-05-15  , 100 gun sonra tarih ne olacak sorusuna cevap verir?

        System.out.println(tarih.plusYears(5).plusMonths(3).plusDays(3));//2028-05-07  , 5 yil 3 ay 3 GUN sonra tarih ne olacak

        System.out.println(tarih.minusWeeks(20));//2022-09-17 20 hafta once tarih
        System.out.println(tarih.minusDays(100).minusMonths(5));//2022-05-27


        System.out.println(tarih.isAfter(tarih2));//true TARIH TARIH 4'DEN DAHA MI ILERI?

       
    }
}
