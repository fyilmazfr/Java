package Practice6;

import java.util.Scanner;

public class Q10 {/* kullanicidan alinan bir stringin ilk ve son harfini yine kullanicidan alinan sayi kadar  return
eden method yaziniz.*/

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir string giriniz");
        String input =scan.nextLine();
        System.out.println("lutfen bir sayi giriniz");
        int sayi = scan.nextInt();

        System.out.println("ilksonHarf(input,sayi) = " + ilksonHarf(input, sayi));
        // input ve sayimiz bizim parametrelerimiz
    }

    public static String ilksonHarf(String input, int sayi) {

        String s=input.substring(0,1) +input.substring(input.length()-1);
        String sonuc="";
        for (int i = 1; i <=sayi ; i++) {
            sonuc=sonuc+s; //sonuc +=s; diyede yazabiliriz


        }
        return sonuc;
    }
}
