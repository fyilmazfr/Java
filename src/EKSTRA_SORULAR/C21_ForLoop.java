package EKSTRA_SORULAR;

import java.util.Scanner;

public class C21_ForLoop {// kullanicidan bir string isteyin ve stringi terseten yazdirin

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
        String str= scan.nextLine();
       // String tersSTR= scan.nextLine();

        String tersSTR=str.substring(str.length()-1);
        for (int i = str.length()-2; i >=0 ; i--){
            tersSTR+=str.substring(i,i+1);

        }
        System.out.print(tersSTR);











    }
}
