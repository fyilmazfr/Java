package RECAP_1;

import java.util.Scanner;

public class Soru11 {//kullanicidan y veya n girdiginde ekrana yes veya no yazdiran bir kod yazin

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen y veya n giriniz");
        char harf=scan.next().charAt(0); // tek karakter kullandigimiz icin char atamasi yaptik

        
        if (harf=='y' || harf=='Y'){
            System.out.println("yes");

        }else  if (harf=='n' || harf=='N'){
            System.out.println("non");
        }else {
            System.out.println("lutfen gcerli karakter giriniz");
        }
    }
}
