package day47_Maps;

import day48_Maps.Students;

import java.util.*;

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
********
*HashMap
1.   HashMap<String,Double> salaries=new HashMap<>();
       salaries.put("QA", 110000.0);
       salaries.put("Dev",130000.00);
       salaries.put("SalesForce",125000.00);

    1.siz  HashMap<String,Double> salaries=new HashMap<>();yazdiginizda java memory'de 16 kutu(bucket) iceren bir yapi
    olusturur ve bu yapidaki herbir kutuya index verir.Index'ler 0 dan 15 e kadardir
    2.Siz salaries.put("QA", 110000.0); kodunu yazdiginizda java key iicn bir hascode olusturur bu hashcode'u 16'ya boler
    ve kalani index olarak kullanir ve bu elemani o index'e yerlestirir
    3. yerlestirirken 4'lu bir yapi olusturur, bu yapinin ilk bolumune Hashcode'u ikinci bolumune Key'i ucuncu
    bolumune value'u ve dorduncu bolumune pointer'i koyar.bu cok bolumlu yapi LinkedList'lerdeki  "Node" dur.
    Yani hashmape bucket'lari koydugu datayi LinkedList olarak depolar.
    4.Java "null" icin herzaman hashcode olarak "zero" uretir, o yuzden key null oldugunda eleman ilk bucket'a
    yerlestirilir.Bundan dolayi key'si null olan elemanlar Map'in icinde genellikle ilk sirada gozukurler
    5.Java normalde HashCOde'lari unique yapar ama bazen trafik kazasi gibi farkli iki eleman icin ayni HashCode
    uretilebilir.Buna "Hash Collision" denir.Hash Collision mehur bir Java Development problemidir.bU PROBLEMLE
    karsilasildiginda developer'lar bu problemi cozmek icin kodlar yazarlar,ama bu Core Java'nin konusu degildir

    *******

    package day48_Maps;

import java.util.Hashtable;

public class HashTable01 {
1. Hash Table bir map'dir.
2.HashTable EntrySet'leri herhangi bir siralamaya tabi tutmaz
3.hasTable HashMap'lerden daha yavastir. cunku HashTable'lar thread-safe ve synchronized'dir.
   thread-safe;Ayni anda birden fazla is yapabilme becerisidir. yani corba piserken salatayi yapabiliyorsunuz, boylelikle
zamandan tasarruf edebiliyorsunuz.
   synchronized; coklu islevin zaman kazandiracak sekilde siralanabilmesidir.zamandan kazanabilmek icin once corbayi
 ardindan da salatayi yapmak gerekir.Tersini yaptigimiz taktirde zamandan kaybederiz.
 Coklu islerde hasTable daha hizlidir.
4.HasTable'larda Key null olamaz.NullPointerException atar.
5.HasTable'larda VALUE null olamaz.NullPointerException atar
(3,4,5. maddeler hashTable ve hashMap'lerin ayni zamanda farklaridir.interwiev sorusudur)


    public static void main(String[] args) {
        Hashtable<String,Integer> countryPopulations=new Hashtable<>();
        countryPopulations.put("USA", 400000000);
        countryPopulations.put("Germany", 83000000);
        countryPopulations.put("Turkey",90000000);

        System.out.println(countryPopulations);
        //countryPopulations.put(null,90000000);//HasTable'larda Key null olamaz.NullPointerException atar.
        //countryPopulations.put("France",null);//HasTable'larda VALUE null olamaz.NullPointerException atar

    package day48_Maps;

    public class Students {
        public String name;
        public String email;
        public int age;
        public boolean success;

        public Students(String name, String email, int age, boolean success) { //burda bir constructor olusturduk
            this.name = name;
            this.email = email;
            this.age = age;
            this.success = success;
        }

        @Override//sag tiklayip, toString methodunu sectik
        public String toString() {//bu classdan olusturdugumuz objelerin detaylarini toString METHODUYLA konsola yazdirdik
            return "Students[" +
                    "name=" + name + '\'' +
                    ", email=" + email + '\'' +
                    ", age=" + age +
                    ", success=" + success +
                    ']';
        }
    }
    Hashtable<String, day48_Maps.Students> myStudents=new Hashtable<>();
myStudents.put("Fransizca",new Students("Fatih Yilmaz","fy@hotmail.com",35,true));
        System.out.println(myStudents);
//{Fransizca=Students[name=Fatih Yilmaz', email=fy@hotmail.com', age=35, success=true]}

    //sirasiyla istedigimiz bilgileri javadan isteyelim
    String name =myStudents.get("Fransizca").name;
        System.out.println(name);//Fatih Yilmaz

    int age=myStudents.get("Fransizca").age;
        System.out.println(age);//35

        *******
        public class TreeMap01 {

    1. TreeMap'ler entrySetleri keylere gore "natural order" da siralar ve cok emek ister
    2.TreeMap'ler en yavas Mapler'dir
    3.TreeMap'ler thread-safe ve syncronized degildir

    public static void main(String[] args) {

        TreeMap<String, Double> salaries = new TreeMap<>();
        salaries.put("Tom Hanks", 3000.00);
        salaries.put("Mary Star", 1000.00);
        salaries.put("Jimy Jones", 5000.00);
        salaries.put("Kevin", 6000.00);
        System.out.println(salaries);//Alfabetik siralama yapti
        //{Jimy Jones=5000.0, Kevin=6000.0, Mary Star=1000.0, Tom Hanks=3000.0}


        SortedMap<String, Double> map1 = salaries.tailMap("Kevin");
        System.out.println(map1);//{Kevin=6000.0, Mary Star=1000.0, Tom Hanks=3000.0}

        NavigableMap<String, Double> map2 = salaries.tailMap("Kevin", false);
        System.out.println(map2);//{Mary Star=1000.0, Tom Hanks=3000.0}
        //Tail kuyruk demektir, map1 de kevin dahil , map2de kevin'siz yazdirdi


        NavigableMap<String, Double> map3 = salaries.subMap("Kevin", true, "Tom Hanks", false);
        System.out.println(map3);//{Kevin=6000.0, Mary Star=1000.0}

        //lowerEntry BIR ONCEKINI VERIR
        Map.Entry<String, Double> map4 = salaries.lowerEntry("Mary Star");
        System.out.println(map4);//Kevin

        //PARIS HILTON OLMASADA SANKI VARMIS GIBI DAVRANIR VE ONCESINI VERIR
        Map.Entry<String, Double> map5 = salaries.lowerEntry("Paris Hilton");
        System.out.println(map5);//Mary Star=1000.0

        //salaries.higherEntry()
        //salaries.floorEntry()
        //salaries.ceilingEntry()

        *****
        public class Maps01 {
    public static void main(String[] args) {

        Size verilen bir cumledeki her kelimenin kac kere kullanildigini gosteren kodu yaziniz
        "I like to move it,move it."
        map ile cozecegiz

    String str= "I like to move it, move it.";
    str=str.replaceAll("\\p{Punct}","");//tum noktalama yi kaldirdik
        System.out.println(str);//I like to move itmove it

    //kelimeleri almak icin split() kullanalim
    String[] kelimeler=str.split(" ");//virgulle ayrilan kelimeleri kelimeler array'ine atadik
        System.out.println(Arrays.toString(kelimeler));//[I, like, to, move, itmove, it]

    HashMap<String,Integer> gorunum=new HashMap<>();//bir hasmap olusturduk
        for (String w:kelimeler) {
        Integer gorunumSayisi=gorunum.get(w);
        if (gorunumSayisi==null){
            gorunum.put(w,1);
        }else {
            gorunum.put(w,gorunumSayisi+1);
        }

    }
        System.out.println(gorunum);//{move=2, like=1, I=1, to=1, it=2}
*/
}






















