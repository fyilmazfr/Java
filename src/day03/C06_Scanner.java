package day03;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class C06_Scanner {// KULLANICIDAN ISMINI VE YASINI ALIP GIRILEN BILGILER=seyfi capar 34 seklinde yazdirin

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        //NOT: string verileri scanner ile alirken next(); ilk bosluga kadar oaln kismi 1 kelime alir
        // NEXT LINE() satirinin sonuna kadar ne yazarsak alir
        //eger ardarda birden fazla string deger  alirsak nextlin() kullanmaliyiz

        System.out.println("lutfen isminizi giriniz");
        String isim= scan.nextLine();

        System.out.println("lutfen soyisminizi giriniz");
        String soyisim = scan.nextLine();

        System.out.println("lutfen yasinizi giriniz");
        Double yas = scan.nextDouble();    // YAS DEDIGI ICIN DOUBLE SECTIK, girilen bilgiler seyfi capar 34 seklinde
        //YAZDIR
        System.out.println("girilen bilgiler ="+isim +soyisim+ yas);




    }
}
