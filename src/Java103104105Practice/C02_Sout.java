package Java103104105Practice;

import java.util.Arrays;

public class C02_Sout {
    /*
    YILMAZ AILESI , YUKARDAN ASAGIYA YAZDIRINIZ
     */
    public static void main(String[] args) {
        String YLM = "YILMAZ AILESI";

       String []arr=YLM.split("");
        System.out.println(Arrays.toString(arr));

        for (String w:arr) {
            System.out.println(w+"\n");

        }
    }
}
