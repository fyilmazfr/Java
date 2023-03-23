package Java103104105Practice;

import java.util.Scanner;

public class ForLoop4 {
    /* kullanicidan alinan bir STRINGIN ilk ve son harfini yine kullanicidan alinan sayi kadar
    tekrarlayan kodu yaziniz
     */


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String kelime= scan.nextLine();
        System.out.println("tekrar sayisi giriniz");
        int tekrar= scan.nextInt();

        String iLKsonhARF=kelime.substring(0,1)+kelime.substring((kelime.length()-1));
        String cikti="";//string havuzu olustururken 0 yazamayiz bu yuzden hiclik ile tanimladik
        cikti=cikti+iLKsonhARF;
        for (int i = 1; i <tekrar ; i++) {
            cikti+=iLKsonhARF;

        }
        System.out.println(cikti);


        }






    }

