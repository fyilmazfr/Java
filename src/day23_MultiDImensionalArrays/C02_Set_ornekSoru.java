package day23_MultiDImensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C02_Set_ornekSoru {/*elimizde urunlerin bulundugu bir liste var urun listesinde ki istenen siradaki urunu
istedigimiz yeni urunle degistirip eski urunu ,varolan eski urunler listesine ekleyelim*/

    public static void main(String[] args) {
        List<String>urunler=new ArrayList<>();//arrayliste'si stringlerden olussun ve adi urunler olsun
        urunler.add("nutella");
        urunler.add("ikram");
        urunler.add("cekirdek");
        urunler.add("cay");

        List<String>eskiurunler=new ArrayList<>();//bir de eski urunler listesi yapalim

        //listede'ki ikrami'in yerine biskrem koyalim ve ikram'i da eski urunler listesine ekleyelim
        String yeniurun="biskrem";
        String silinecekUrun="ikram";
        //listemiz binlerce icerikten olusabilir ve herdefasinda ikram nerdeydi diye bakmamiz zor olur bunun icin;
        int temp=urunler.indexOf(silinecekUrun);//silinecekurun'nun kacinci indexde oldugunu bize verir

        String silinenUrun=urunler.set(temp,yeniurun);//temp index'ine yeni urunu ekle
        eskiurunler.add(silinenUrun);//silenen urunu eskiurunlere ekle

        System.out.println("urunler listesi:"+urunler);//urunler listesi:[nutella, biskrem, cekirdek, cay]
        System.out.println("eski urunler listesi"+eskiurunler);//eski urunler listesi[ikram]


        //ornegin basak birseyleri de degistirelim
        yeniurun="nohut";
        silinecekUrun="cekirdek";

        temp=urunler.indexOf(silinecekUrun);
        silinenUrun=urunler.set(temp,yeniurun);
        eskiurunler.add(silinenUrun);

        System.out.println("urunler listesi:"+urunler);//urunler listesi:[nutella, biskrem, nohut, cay]
        System.out.println("eski urunler listesi"+eskiurunler);//eski urunler listesi[ikram, cekirdek]
    }
}
