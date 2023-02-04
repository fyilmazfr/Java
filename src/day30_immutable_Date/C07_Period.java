package day30_immutable_Date;

import java.time.LocalDate;
import java.time.Period;

public class C07_Period {
    public static void main(String[] args) {
        //iki tarih arasinda ki sureyi bulma

        LocalDate tarih1=LocalDate.of(1988,3,26);
        LocalDate bugun=LocalDate.now();

        Period period= Period.between(bugun,tarih1);//tarih1 ve bugunun tarihi arasindaki farki bulmak
        //icin period.between methodu kullandik
        System.out.println(period);//P-34Y-10M-9D
    }
}
