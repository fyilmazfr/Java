package day46_Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Notlar {/*
*Maps ler key-value pairs kullanir. (anahtar-degerler)
*Keyler unique olmalidir
*Map ile ayni ozelliklere sahip birden fazla objeyi ve ozelliklerini store edebilirisniz.
*Map modern reel uygulamalarda kullandigimiz en guncel java objesidir.
*Map'lerde ayni ozelliklere sahip ve ozellikleri ayni bicimde tektiplestirilmis datalar saklayabiliriz
*Tektiplestirme sonradan datalara ulasabilmek icin onemlidir.
*Map'e ekleyecegimiz tum ozellikler 2 parcadan (key/value) olusmalidir.key ve value icin data turu sinirlamasi yoktur
  istedigimiz data turunu secebiliriz.
*map olustururken key ve value'nun data turune karar vermis olmamiz vee bunu deklare etmemiz gerekir
*Map'de tum islemler key uzerinden yapilir,bundan dolayi key degrleri unique olmalidir
*Bir firmada calistigimizda eger map kullaniliyorsa ,map'in data yapisi hep ayni olacaktirBizden istenen herhangi bir
 gorevi yaparken gorevi bagimsiz methodlarla kurgulamak,ilerde yapacagimiz gorevlerde kolaylik saglayacaktir

*suleyman hoca maps'ler

public class HashMap01 {
    /*Map'lerde key kismi tekrarsiz(unique) olmalidir.
    value=non unique tekrarli data icerebilir
    key kisminda null TEKRARSIZ olarak kullanilir
    value kisminda null mumkundur ve bircok kere kullanilabilir
 -->>  Maplerde eleman degil EntrySet kullaniriz
    Dog=Kopek bu kismi aciklarken EntrySet(giris)=kopek
    Neden Set diyoruz; cunku set tekrarsizdir, ve key kismi unique oldugu icin set olmalidir.
    HasMap'ler EntrySet'leri herhangi bir siralamaya tabi tutmaz, rastgele siralar
    siralama ile vakit kaybetmedigi icin HasMap'ler cok hizli calisirlar

    public static void main(String[] args) {
        HashMap<String, Integer> studentAges=new HashMap<>();
        studentAges.put("Ali", 13);       //EntrySet'lerde ekleme methodu put'dur
        studentAges.put("Tom", 21);
        studentAges.put("Brad", 12);
        studentAges.put("Ajda", 76);
        studentAges.put("Cuneyt", 75);
        studentAges.put("Ali", 88);//Ayni key degerini tekrar kullandiginizda hata vermez "overwrite" yapar
        studentAges.put(null, 55);
        studentAges.put(null, 66);//null'i guncelledi
        studentAges.put("Ayhan isik", null);
        studentAges.put("sadri alisik", null);
        System.out.println(studentAges);//RASTGELE SIRALAMA YAPAR ,{Tom=21, Ajda=76, Brad=12, Cuneyt=75, Ali=13}
        //{Tom=21, Ajda=76, Brad=12, Cuneyt=75, Ali=88}

        //map'den sadece key'ler nasil alinir?
        studentAges.keySet();//keyleri set'in icine koyup verecegim der java,bu yuzden bir set olusturmamiz lazim
        Set<String> keys=studentAges.keySet();
        System.out.println(keys);//[sadri alisik, Ayhan isik, Tom, null, Ajda, Brad, Cuneyt, Ali]

        //Map'ten sadece value'lar nasil alinir?
        Collection<Integer> values= studentAges.values();//ayni sekilde burasi icinde java collection donfurecegi icin col.yaptik
        System.out.println(values);//[null, null, 21, 66, 76, 12, 75, 88]

        //Belli bir key'e ait value nasil alinir?orn; Cuneytin yasini merak ediyorum
        Integer CuneytAge=studentAges.get("Cuneyt");//cuneyt'in yasi bize Integer dondurecek, cunku yukardaki listede oyle
        //buyuzden integerdan cuneytAge yaptik, ve bunu da yazdiralim
        System.out.println(CuneytAge);//75 verdi



        //example1; TUm integr yaslarin ortalamasini hesaplayan kodu yaziniz.
        Collection<Integer> ages=studentAges.values();
        Integer sumToplam=0;//collection'dan  Integr degerleri buraya atacagiz,(normal int yazsak'da olur)
        int counter=0;
        for (Integer w:ages) {
            if (w!=null){//nul olan dgerleri almamak icin degilse dedik
                sumToplam=sumToplam+w;
                counter++;
            }

        }
        System.out.println("ortalama yas;"+ sumToplam/counter);//toplam yasi sayac'a bolduk ort. icin
        //ortalama yas;56


        //Example 2; A ile baslamayan isimlerin icerdigi toplam karakter sayisini bulan kodu yaziniz
        Set<String> isim=studentAges.keySet();
        int sum1=0;

        for (String w:isim) {
            if (w!=null && !w.startsWith("A")){
                sum1=sum1+w.length();//TOPLAM KARAKTER SAYISI ICIN

            }

        }
        System.out.println(sum1);//29 toplam karakter sayisi


        //simdi baska method'lara bakalim

        boolean resultAJDA =studentAges.remove("Ajda", 76);//eger dogru deger girmezsek silmez bize False verir.
        System.out.println(resultAJDA);//true verdi yani ajda'yi sildi

        //baska bir remove mehoduna bakalim
        Integer result1=studentAges.remove(null);//bu remove methodu direk sile ve bize de varsa Integer degerini dondurur yani birnevi
        // kontrol mekanizmasi
        System.out.println(result1);//true 66

        //Key varsa value'u ver, key yoksa bir mesaj ver methodu
        //getOrDefault METHODU ILE VARSA var olan degeri yoksa sizin yazdiginiz degeri size verir ,biz 0 vermistik

        Integer result2 =studentAges.getOrDefault("Brad", 0);//method'a gidecek brad varsa brad'e koydugumuz degeri verecek eger yoksa
        //bana 0 verecek

        System.out.println(result2);//12
        //yada
        Integer result3 =studentAges.getOrDefault("Brandon", 0);
        System.out.println(result3);//0


        //Value null ise ekleme yapar, value null degilse ekleme yapmaz..putIfAbsent
        Integer result4 =studentAges.putIfAbsent("Ayhan Isik", 100);
        System.out.println(result4);
        System.out.println(studentAges);

        //Key yoksa ekleme yapar ,.putIfAbsent
        Integer result5=studentAges.putIfAbsent("Acun Ilicali", 200);
        System.out.println(result5);
        System.out.println(studentAges);//{sadri alisik=null, Ayhan Isik=100, Ayhan isik=null, Tom=21, Brad=12, Cuneyt=75, Acun Ilicali=200, Ali=88}


        //replace methodu'u value'lari  key'e bakarak degistirdi
        studentAges.replace("Acun Ilicali", 49);//acunun yasina bak 49 degilse degistir
        System.out.println(studentAges);//{sadri alisik=null, Ayhan Isik=100, Ayhan isik=null, Tom=21, Brad=12, Cuneyt=75, Acun Ilicali=49, Ali=88}

        //replace() method'u value'lari key ve valu'yu kontrol ettikten sonra degistirdi
        studentAges.replace("Acun Ilicali", 47,53);
        System.out.println(studentAges);//{sadri alisik=null, Ayhan Isik=100, Ayhan isik=null, Tom=21, Brad=12, Cuneyt=75, Acun Ilicali=49, Ali=88}


        //Example 3; Map'deki her bir entry'i ekrana farkli bir satirda olacak sekilde yazdiriniz
        //entrySet() methodu Map'teki elemanlatri bir Set'in icine koyarak size verir
        Set<Map.Entry<String,Integer>> entries=studentAges.entrySet();
        for (Map.Entry<String,Integer> w:entries) {
            System.out.println(w);

            sadri alisik=null
Ayhan Isik=100
Ayhan isik=null
Tom=21
Brad=12
Cuneyt=75
Acun Ilicali=49
Ali=88

        */







}
