package Java103104105Practice;

import java.util.Scanner;

public class SwitchCase2 {
    /*
     bulunanGun =(kacGunSonrasi + kacinciGun)  %7;
     bir oceki soruyu kendim cozecegim
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen pazartsi  1 \t , sali 2 \t , carsamba 3\t , persembe 4 \t ,cuma 5 \t" +
                "cumartesi 6 \t pazar icin 7 \t");// \t bosluk yapar
        int kacinciGun= scan.nextInt();

        //istenmeyen durum
        if (kacinciGun<=0 || kacinciGun>7){
            System.out.println("hatali giris yaptiniz");
        }else {
            //simdi istenen durumu switch case kullanarak yapiyorum
            System.out.println("kac gun sonrasini bilmek istiyorsunuz");
            int kacGunSonrasi= scan.nextInt();
            int bulunanGun=( kacGunSonrasi+ kacinciGun)  %7;



            switch (bulunanGun){
                case 1:
                    System.out.println(kacGunSonrasi +"gun sonrasi pazartesi");
                    break;
                case 2:
                    System.out.println(kacGunSonrasi +"gun sonrasi SALI");
                    break;
                case 3:
                    System.out.println(kacGunSonrasi +"gun sonrasi CARSAMBA");
                    break;
                case 4:
                    System.out.println(kacGunSonrasi +"gun sonrasi PERSEMBE");
                    break;
                case 5:
                    System.out.println(kacGunSonrasi +"gun sonrasi CUMA");
                    break;
                case 6:
                    System.out.println(kacGunSonrasi +"gun sonrasi CUMARTESI");
                    break;
                case 0://pazar gunu 7 gun ve mod alinca kalan 0 oldugu icin
                    System.out.println(kacGunSonrasi +"gun sonrasi PAZAR");
                    break;
                default:
                    System.out.println("lutfen gecerli bir deger giriniz");
            }
        }
    }
}
