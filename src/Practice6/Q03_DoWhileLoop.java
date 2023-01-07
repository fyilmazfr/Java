package Practice6;

import java.util.Scanner;

public class Q03_DoWhileLoop {/*kullanicidan x girilene kadar program caliisyor yazan ve
x girildiginde ise program bitti yazan programi yaziniz*/

    public static void main(String[] args) {
        Scanner abc=new Scanner(System.in);
        String str="";
        do {

            System.out.println("lutfen bir string giriniz");
            str= abc.nextLine();
            System.out.println("program calisiyor");

        }while (!str.equalsIgnoreCase("x"));
        System.out.println("program bitti");


    }
}