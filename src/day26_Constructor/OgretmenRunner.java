package day26_Constructor;

public class OgretmenRunner {
    public static void main(String[] args) {
        Ogretmen ogretmen1=new Ogretmen();
        System.out.println("ogretmen1"+ogretmen1);// suan hic birsey belirtmeden ogretmen1 clasini yazdirallim

        System.out.println();//araya bosluk atiyorum

        //simdi birde ogretmen2 olusturalim ve buna parametreleri yazalim istedigimiz
        Ogretmen ogretmen2=new Ogretmen("Emre","Akdogan","01.01.1988","matematik","fizik");
        System.out.println("ogretmen2"+ogretmen2);

        //bir ogretmen daha olusturalim
        //not;ogretmen clas'inda 5 ve 3 parametreli constructorlar olusturduk ,ornegin ogretmen3 e 2
        //parametre girersek java bunu kabul etmez ama bunu olusturmak istersekte yeni bir constractur olusturmamiz gerekir
        System.out.println();

        Ogretmen ogretmen3=new Ogretmen("cavidan","kabinkara","01.01.1978");
        System.out.println("ogretmen3"+ogretmen3);
    }
}
