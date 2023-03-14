package Java103104105Practice;

import java.util.Scanner;

public class SwitchCase3 {
    /*
    kullanicidan ilk 3 buyuk harften biri secildiginde cumle yazdiran kod yaziniz
    kullanici A B ve C harflerini secisin
    ve her bir harfe bir cumle gelsin
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir A B C harflerinden birini secin");
        char harf=scan.next().charAt(0);

        switch (harf){
            case 'A':
                System.out.println("hayat guzeldir");
                break;
            case 'B':
                System.out.println("JAVA GUZELDIR");
                break;
            case 'C':
                System.out.println("insallah olacak");
                break;
            default:{
                System.out.println("lutfen gecerli karakter giriniz");
            }
        }
    }
}
