package Practice7;

import java.util.Arrays;

public class Q02_MDArray {/*STRINg 2D array olustur
 *{{"$12" , "$22" , "0$"} , {"£9" ,"£40" , "$1} , {"£12", "$2" , "$0"} }
 *string de $ varsa 3.2 ile carp
 *string de £ varsa 4.2 ile carp
 *elemanlarin toplamini double olarak yazdir */

    public static void main(String[] args) {
        String [][] arr={{"$12","$22","$0"},{"9€","40€","$1"},{"€12","$2","$0"}};

        double toplam=0;
        for (int i = 0; i <3 ; i++) {//length yerine direk 3 yazdik kolaylik olsun diye
            for (int j = 0; j <3 ; j++) {// burasida yani sekilde

                if (arr[i][j].contains("$")){ //$ isareti iceriyorsa
                    toplam+=Double.parseDouble(arr[i][j].replace("$",""))*3.2;
                    //dATA CASTING yaptik yani stringi double a cevirdik ve dolar isaretlerinden kurtulduk, son olarakta
                    //3;2 ile carptik


            }else {
                    toplam+=Double.parseDouble(arr[i][j].replace("€",""))*4.2;
                }

        }
    }
        System.out.println(Arrays.deepToString(arr));//bu sekilde egr istersek iki boyutlu array'i sembolsuz haliyle gormus olduk
        System.out.println("toplam :"+toplam);
}}