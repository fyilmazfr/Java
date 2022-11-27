package day03;

import java.util.Scanner;

public class C04_Scanner{
    public static void main(String[] args) {
        // KULLANICIDAN isim isteyin
        // girilen ismi
        // girilen isim fatih seklinde yazdirin
         // SCANNER OBJESI OLUSTURALIM
        // Scanner objesi olusturalim
        //1. Scanner objesi olsturalim
        Scanner scan=new Scanner(System.in);
        // 2.KULLANICIYA NE ISTEDIGIMIZI SOYLEYELIM
        System.out.println("lutfen isminizi giriniz");
        //3. (burasi cok onemli,OLUSTURDUGUMUZ SCAN OBJESI ILE KULLANICININ GIRDIGI DEGERI ALIP OLUSTURACAGIMIZ UYGUN
        //BIR VERIABLES ATAYALIM
        String kullaniciIsmi=scan.next();
        System.out.println("isminiz"+ kullaniciIsmi);






    }

}
