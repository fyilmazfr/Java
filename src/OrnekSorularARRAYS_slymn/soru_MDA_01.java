package OrnekSorularARRAYS_slymn;

import java.util.Arrays;

public class soru_MDA_01 {
    public static void main(String[] args) {

        //multi dimensionel arraylerde eleman ekleme nasil yaplir
        int arr[][] = new int[3][2];
        System.out.println(Arrays.deepToString(arr));
        arr[1][0] = 6;
        arr[0][0] = 3;
        arr[0][1] = 4;
        arr[1][1] = 18;
        arr[2][0] = -7;
        arr[2][1] = 0;


        System.out.println(Arrays.deepToString(arr));
        //yada bir stringi yazdiralim
        System.out.println(Arrays.toString(arr[2]));
        System.out.println(arr[2][0]);//tek bir elemani yazdirirken


        //SORU; string bir mda olusturunuz
        // elemanlari ekleyiniz
        // TOPLam eleman sayisini yazdiran kodu yaziniz

        String str [][]=new String[2][2];
        str [0][0]="fatih";
        str [0][1]="ilknur";
        str [1] [0]="melih";
        str[1][1]="akif";

        System.out.println(Arrays.deepToString(str));
        int sayac=0;
        for (String [] w:str) {
            sayac=sayac+w.length;//sayac yukarda 0 yani 0 + w'nin length

        }
        System.out.println("ELEMAN SAYISI ;"+sayac);

            }




    }


