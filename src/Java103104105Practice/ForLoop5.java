package Java103104105Practice;

import java.util.Scanner;

public class ForLoop5 {
    /*
    KULLANICIDAN ALACAGINIZ 'c' ve 'a' iceren bir String deger icerisindeki 'c' karakterinden onceki 'a' karakterlerinin
    sayisini bulan bir kod yaziniz
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String kelime = scan.nextLine();

        int sayacA = 0;



        for (int i = 0; i < kelime.length(); i++) {
            if (kelime.charAt(i)=='a'){
                sayacA++;

            } else if (kelime.charAt(i)=='c'){
                break;
            }


        }

        System.out.println(sayacA);
    }
}


