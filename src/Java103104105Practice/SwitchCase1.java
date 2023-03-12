package Java103104105Practice;

import java.util.Scanner;

public class SwitchCase1 {
    /*
    kullanicinin yasadigi gune gore
    kullanicinin verecegi gun kadar sonraki gunun hangi gun oldugunu yazdiriniz
    pazartesi hafta baslangici
    bulunanGun =(kacGunSonrasi + kacinciGun)  %7;
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen haftanin hangi gununde oldugunuzu sayi olarak giriniz ");
        int gunNo = scan.nextInt();

        if (gunNo <= 0 || gunNo > 7) {
            System.out.println("lutfen 1-7 arasi rakam giriniz");
        } else{
            System.out.println("kac gun sonrasini bilmak istiyorsunuz");
            int kacgunsonrasi = scan.nextInt();
            int bulunangun = (kacgunsonrasi + gunNo) % 7;




                switch (bulunangun) {
                    case 1:
                        System.out.println(kacgunsonrasi + " gun sonrasi pazartesi");
                        break;
                    case 2:
                        System.out.println(kacgunsonrasi + " gun sonrasi sali");
                        break;
                    case 3:
                        System.out.println(kacgunsonrasi + " gun sonrasi cars");
                        break;
                    case 4:
                        System.out.println(kacgunsonrasi + " gun sonrasi per");
                        break;
                    case 5:
                        System.out.println(kacgunsonrasi + " gun sonrasi cuma");
                        break;
                    case 6:
                        System.out.println(kacgunsonrasi + " gun sonrasi cumartesi");
                        break;
                    case 0:
                        System.out.println(kacgunsonrasi + " gun sonrasi pazar");
                        break;
                    default:
                        System.out.println("lutfen gecerli bir deger giriniz");
                }
            }


        }

    }

