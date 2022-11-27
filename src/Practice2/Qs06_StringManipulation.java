package Practice2;

import java.util.Scanner;

public class Qs06_StringManipulation {// NAME1 VE NAME2 DEGISKENLERI OLUSTURUN
    //NAME1 DEGISKENININ KARAKTER SAYISI CIFT ISE KELIMENIN ORTASINA NAME2 YI YERLESTIRIN
    //TEK ISE NAME1 DEGISKENI CIFT SAYILI OLDUGUNDAN ORTASINA YERLESTIREMEDIK

    public static void main(String[] args) {


        String name1="mehmet";

        String name2="ahmet";

        if (name1.length()%2==0) {
            System.out.println(name1.substring(0,name1.length()/2).concat(name2).concat(name1.substring(name1.length()/2)));
        }else {
            System.out.println("NAME1 DEGISKENI CIFT SAYILI OLDUGUNDAN ORTASINA YERLESTIREMEDIK");
        }
    }

}
