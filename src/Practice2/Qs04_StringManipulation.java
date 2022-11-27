package Practice2;

import java.util.Scanner;

public class Qs04_StringManipulation {// KULLANICIDAN 4 KELIME ISTEYIN VE VE BU KELIMELERI CUMLE OLARAK YAZDIRIN
    //VE SONUNA . ISARETI EKLEYIN

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 1.kelimeyi girin");
        String str1= scan.nextLine();

        System.out.println("2.kelime");
        String str2=scan.nextLine();

        System.out.println("3.kelime girin");
        String str3= scan.nextLine();

        System.out.println("4.kelimeyi girin");
        String str4= scan.nextLine();


        System.out.println(str1.concat(" ").toUpperCase()+ str2.concat(" ").toUpperCase()+ str3.concat(" ").toUpperCase()+str4.concat(".").toUpperCase());
        // yada baska bir metodla bunu yapabiliriz
        System.out.println(str1.substring(0,1).toUpperCase()+str1.substring(1)+" "+str2+" "+str3+" "+str4+".");
    }
}