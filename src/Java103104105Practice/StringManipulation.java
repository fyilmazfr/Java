package Java103104105Practice;

import java.util.Scanner;

public class StringManipulation {
    /*
    kullanicidan email adresini girmesini isteyiniz
    mail.gmail.com icermiyorsa "gmail adresi girinizlutfen
    @gmail.com ile bitiyorsa email adresi kaydedildi
    bu sekilde bitmiyorsa lutfen yazimi kontrol ediniz
    yazdirin
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen mail adresini giriniz");
        String email= scan.nextLine();

        if (!email.contains("@gmail.com")){
            System.out.println("gmail adresi giriniz lutfen ");
        }else if (email.endsWith("@gmail.com")){
            System.out.println("email adresiniz kaydedildi");
        }else System.out.println("lutfen yazimi kontrol ediniz");


    }
}
