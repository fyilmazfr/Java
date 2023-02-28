package day44_Collections;

public class NOTLAR {
    /*
1.collectins; jabva da birden fazla data barindiran yapilardira. Interface ve classdan olusur
2.interfaceler ortak ozelliklere sahip child classlari bir cati altinda toplamak icin kullanilir
3. temel yapi olarak 3 yapi vardir
* LIST
* Queue ve (Deque)
* Set
bunlarin disinda 5 KELIME bilmemiz gerekir
4.* set (kume); elemanlar tekrarsiz,e-devlet gibi
* Linked ;bagli demek,(halay) ,ekleme ve cikarma cok iyi ,arama cok yavas
* Tree (Dogal sirali); eklenen her eleman natural order'a gore yerlestirilir
* Hash ;her bir element icin unique bir hash code olusturulup arsive yerlestirir, bulmada hizli
* Queue (kuyruk,sira); eklene sona eklenip, ayrilan bastan ayrilir
5.LinkedList, birbirine bagli node'lar olusur, her bir node'da bir deger ve sonraki node'un adresi bulunur.ilk eleman
Head'dir, head sadece adres icerir,deger icermez, son elementde ise deger vardir, adres olarak null pointer kullanir
6.LinkedList'in 3 tane parent interface'i vardir.LinkedList olusturuken data turu LinkedList secilirse tum
 parentlarindaki ozellikleri kullanabiliriz(List,Queue,Deque). List,Deque veya Queue secilirse o interface'lerdeki
 ozellikleri kullanabilir.

*LinkedList(class)
ilk eleman herzaman head'dir ve head'de data yoktur,sadece adress vardir.
son eleman (tail) null'i point eder
her eleman icinde data ve adress kismi olmak uzere iki kisim vardir
tum elemanlar pointerlar/adreslr kullanilirak birbirine baglanir
her eleman Node olarak adlandirilir

*
    LinkedList<String> ll1=new LinkedList<>();//linkedlist'in kendisinden bir obje olustururuz.
    List<String> ll2=new LinkedList<>();//data turu olarak list'i sectik ki butun methodlari alabilelim,yani parent class olarak da secmis olduk
    Queue<String> ll3=new LinkedList<>();//yukardaki ayni seyi yaptik
    Deque<String> ll4=new LinkedList<>();

* Deque=//double ended Que
*deque iki tarfali queue demektir, dolayisiyla her method'un first ve last'i vardir
*PriortyQueue constructor'i kullanak que uretirsiniz orn;banka da banka musterisinin sirada oncelikli olmasi
que icin ayirici ozellik ;elemanlar en sona eklenir ve en bastan silinir, bu sisteme FIFO(First in First Out) denir
eczaneler ,yemekhaneler bu siteme kullanir
*que metholari;
peek ,ilk elemani silmeden bize return eder
poll, ilk elemani que den siler ve bize return eder
offer, elman eklemek icin kullanilir
*deque iki tane sonu olan kuyruk
hem FIFO hem de LIFO( last in FIRST OUT) gecerlidir

*SETS
mat kume mantigiyla calisir her element uniquedir
*java elementleri unique yapmak icin HASH ALGORITMASI kullanir

* OBJECT tum classlarin babasidir
public class C02_CollectionDataTuru {
    public static void main(String[] args) {
        List<String> liste=new ArrayList<>();
        //liste.add(5);
        //liste.add('s');
        //liste.add("ali");

        List<Object> list=new ArrayList<>();
        list.add(5);
        list.add('s');
        list.add(true);
        list.add("ali");

        System.out.println(list);//[5, s, true, ali]

        0. index'i degistirmeye calistik ve casting yapmak zorunda kaldik
         list.set(0,(Integer)list.get(0)+5);//[10, s, true, ali]

Colelctions <dataturu> nu object secmemiz durumunda Collection'a farkli data turlerinden objeler koymaniza izin verir
bu depolama acisindan bize esneklik saglar ancak islem yaparken tum objeleri object olarak tanimladigimizdan cok fazla
casting yapmamiz gerekebilir

*
HASHCODE











     */
}
