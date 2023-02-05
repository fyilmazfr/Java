package day31_timeFormatter_Varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_TimeFormatter {
    public static void main(String[] args) {

        LocalDateTime tarihSaat=LocalDateTime.now();
        System.out.println("ilk olusturulan tarih :"+tarihSaat);//2023-02-05T16:04:18.734107200

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/M/yy   hh:mm");
        System.out.println(dtf1.format(tarihSaat));//05/2/23   04:10   BIZE TARIHI BIZIM KULLANDIGIMIZ SEKILDE CEVIRDI


        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MMM/yyyy   HH:mm a");
        System.out.println(dtf2.format(tarihSaat));//         05/févr./2023   16:14 PM


        /* parantez ici nasil yazilirsa sout onun ciktisini ona gore veriyor ornegin 4 buyuk M harfi yazilirsa
        ay'in tam ismini yazar veya buyuk H yazilirsa pm gibi formatlar veriyor
        google dan time formatter lari aratilip bakilabilir
         */


    }
}
