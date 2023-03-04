package day47_Maps;

import java.util.HashMap;

public class HashMap01 {
    /*Map'lerde key kismi tekrarsiz(unique) olmalidir.
    value=non unique tekrarli data icerebilir
    key kisminda null TEKRARSIZ olarak kullanilir
    value kisminda null mumkundur ve bircok kere kullanilabilir
    Maplerde eleman degil EntrySet kullaniriz
    Dog=Kopek bu kismi aciklarken EntrySet(giris)=kopek
    Neden Set diyoruz; cunku set tekrarsizdir, ve key kismi unique oldugu icin set olmalidir.
    HasMap'ler EntrySet'leri herhangi bir siralamaya tabi tutmaz, rastgele siralar
    siralama ile vakit kaybetmedigi icin HasMap'ler cok hizli calisirlar
     */
    public static void main(String[] args) {
        HashMap<String, Integer> studentAges=new HashMap<>();
        studentAges.put("Ali", 13);       //EntrySet'lerde ekleme methodu put'dur
        studentAges.put("Tom", 21);
        studentAges.put("Brad", 12);
        studentAges.put("Ajda", 76);
        studentAges.put("Cuneyt", 75);
        studentAges.put("Ali", 88);//Ayni key degerini tekrar kullandiginizda hata vermez "overwrite" yapar
        studentAges.put("null", 55);
        studentAges.put("null", 66);//null'i guncelledi
        studentAges.put("Ayhan isik", null);
        studentAges.put("sadri alisik", null);
        System.out.println(studentAges);//RASTGELE SIRALAMA YAPAR ,{Tom=21, Ajda=76, Brad=12, Cuneyt=75, Ali=13}
            //{Tom=21, Ajda=76, Brad=12, Cuneyt=75, Ali=88}

        //map'den sadece key'ler
    }



}
