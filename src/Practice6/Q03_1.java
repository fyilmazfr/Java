package Practice6;

import java.util.Scanner;

public class Q03_1 {/*kullanicidan x girilene kadar program caliisyor yazan ve
x girildiginde ise program bitti yazan programi yaziniz*/

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str="";

        do {
            System.out.println("lutfen bir string giriniz");
           str= scan.nextLine();
            System.out.println("program calisiyor");

        }while (!str.equalsIgnoreCase("x"));
        System.out.println("program bitti");
    }






}
