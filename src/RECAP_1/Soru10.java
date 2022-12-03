package RECAP_1;

import java.util.Scanner;

public class Soru10 {
    //kullaniciya ad,memleket,su anki konum,yas,boy soran bir program olusturun
    //ve yasadiklari yeri seviyorlarsa
    //bu bilgiyi yazdirin

    //next() only can read the first word
    //nextline() can read the whole line
    public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
        System.out.println("lutfen ,isim , soyisim  ,   giriniz");
        String isimSoy= scan.nextLine();
        System.out.println("lutfen yasinizi giriniz");
        int yas=scan.nextInt();
        System.out.println("boyunuzu giriniz");
        double boy=scan.nextInt();

        System.out.println("yasadiginiz konumu seviyormusunuz");
        boolean konum= scan.nextBoolean();


        System.out.println("isim soyisim"+isimSoy+ "\n" +"yas" +yas+ "\n" +"boy" +boy/100+ "\n"+ "yasadiginiz yeri seviyormusunuz" +konum);

}}
