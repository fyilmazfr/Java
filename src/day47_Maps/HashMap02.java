package day47_Maps;

import java.util.HashMap;

public class HashMap02 {
    public static void main(String[] args) {/*
    1.siz  HashMap<String,Double> salaries=new HashMap<>();yazdiginizda java memory'de 16 kutu(bucket) iceren bir yapi
    olusturur ve bu yapidaki herbir kutuya index verir.Index'ler 0 dan 15 e kadardir
    2.Siz salaries.put("QA", 110000.0); kodunu yazdiginizda java key iicn bir hascode olusturur bu hashcode'u 15'e boler
    ve kalani index olarak kullanir ve bu elemani o index'e yerlestirir
    3. yerlestirirken 4'lu bir yapi olusturur, bu yapinin ilk bolumune Hashcode'u ikinci bolumune Key'i ucuncu
    bolumune value'u ve dorduncu bolumune pointer'i koyar.bu cok bolumlu yapi LinkedList'lerdeki  "Node" dur.
    Yani hashmape bucket'lari koydugu datayi LinkedList olarak depolar.
    4.Java "null" icin herzaman hashcode olarak "zero" uretir, o yuzden key null oldugunda eleman ilk bucket'a
    yerlestirilir.Bundan dolayi key'si null olan elemanlar Map'in icinde genellikle ilk sirada gozukurler
    5.Java normalde HashCOde'lari unique yapar ama bazen trafik kazasi gibi farkli iki eleman icin ayni HashCode
    uretilebilir.Buna "Hash Collision" denir.Hash Collision mehur bir Java Development problemidir.bU PROBLEMLE
    karsilasildiginda developer'lar bu problemi cozmek icin kodlar yazarlar,ama bu Core Java'nin konusu degildir
    */

        HashMap<String,Double> salaries=new HashMap<>();

        salaries.put("QA", 110000.00);
        salaries.put("Dev",130000.00);
        salaries.put("SalesForce",125000.00);

    }


}
