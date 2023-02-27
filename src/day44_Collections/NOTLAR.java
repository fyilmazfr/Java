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










     */
}
