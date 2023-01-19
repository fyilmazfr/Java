package OrnekSorularARRAYS_slymn;

import java.util.Arrays;

public class soru1 {
    public static void main(String[] args) {
        //string bir arrays olusturunuz "tom" ve "tom" dan onceki tum elemanlari ekrana yazdiriniz

        String[] arr = {"ahmet", "fatih", "melih", "tom", "senih", "meva"};


        for (String each : arr) {

            System.out.print(each + " ");//yazdirip kontrol ettirelim
            if (each.equals("tom"))
                break;


        }

    }




}




