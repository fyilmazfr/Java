package Java103104105Practice;

import java.util.Scanner;

public class IfStatement_Char {
    /*
    /*
    kullanicidan Y/N ikilisinden birisini girdiginde degeri ekrana yazdiran kodu yaziniz
    input Y--> OUTPUT -->> YES
    input N-->               NO
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Y veya N harfleri giriniz");
        char harf=scan.next().charAt(0);

        if (harf=='Y' || harf=='y'){
            System.out.println("YES");
        }else if (harf=='N' || harf=='n'){
            System.out.println("NO");
        }else {
            System.out.println("gecerli karakter giriniz");
        }
    }
}
