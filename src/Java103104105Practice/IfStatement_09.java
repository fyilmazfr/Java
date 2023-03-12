package Java103104105Practice;

import java.util.Scanner;

public class IfStatement_09 {
    /*
    kullanicidan dortgenin kenar uzunluklarini isteyin
    ve  dortgenin kare olup olmadigini yazdirin

     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 4 kenar uzunlugunu giriniz");
        int kenar1= scan.nextInt();
        int kenar2= scan.nextInt();
        int kenar3= scan.nextInt();
        int kenar4= scan.nextInt();

        if (kenar1==kenar2 && kenar2==kenar3 && kenar3==kenar4){
            System.out.println("keanr uzunluklari esit ve bu bir kare olur");
        }else {
            System.out.println("bu bir dortgendir");
        }
    }
}
