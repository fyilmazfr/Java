package day41_AbstractClasses;

public class Notlar {/*
*Abstract class(soyut), genellikle ortak ozellikleri olan nesneleri tek bir cati altinda toplamak icin kullanilir.
*abstractlar bi standart class'laridir.KENDILERINDEN OBJE OLUSTURULMAZ.
*public abstract C_Abstract {
 bir clas'i abstract yapmanin yolu basina abstract yazmaktir.
 Abstract class'larinin ortak ozelligi basiana abstract yazilmasidir ve Class'in sekli normal class'lardan farkli olur.

*Bir abstract class'larda variable'larla ilgili konusmayiz.Abstract class'lar methodlarla ilgilidir.
*TSI standdartlari belirler ama kendisi ekmek degildir.
    Bir method'un child class'lar icin bir standart oldugunu declare ederiz.Ve method body'sine ihtiyac kalmaz.

*   abstract void carpma();
    abstract void bolme();

    void cikarma(){
        System.out.println("bu method cikarma yapar");
        //hem abstract yazip hemde body olusturamayiz, ikisinden birinden vazgecmemiz lazim.
    }
*
public class D_ChildofAbstract extends C_Abstract{
    @Override
    void carpma() {

    @Override
    void bolme() {

     abstract class'lar child class'larin sahip olmalari gereken mecburi ozellikleri belirlerler
        (gunluk hayatimizdaki standartlar gibi) Abstract bir class'i parent edinen tum child'lar  parent abstract
        class'daki tum abstract method'lari override etmek zorundadir ,(sag tiklayip carpma ve bolme methodlarini
        getirdik)
        }
*main method:abstract class'da main method opsiyoneldir.Eger abstract class sadece
   class sadece  child class'larin tasimak zorunda oldugu ozellikleri belirlemek icin o lusturulduysa main method'a
ihtiyac olmaz sadece abstract method'lar olur.Ama bir abstract method'da standart belirlemek disinda da method'lar
calisabilir. Bu durumda ihtiyac olursa main method olusturulabilir.

* Sadece child class'larin mecburi tasiyacaklari ozellikleri belirleyen method'lar abstract method olur ve
    abstract'larin body'si olmaz.
*
public void klima(){
        System.out.println("bazi arabalarada klima olabilir");
abstract olmayan method'lara concrete method denir.abstract bir method'u abstract keyword ile belirlemek ZORUNLUDUR.
  concrate methodlar'da bunun deklare edilmesine gerek yoktur.biz sadece abstraction ile ilgili konustugumuzda
  abstract olmayan method'lardan bahsetmek icin concrete tabirini kullaniriz.

*parent class'daki standart belirleyici method'lar (abstract method)'larin tamami child class tarafindan
    override edilmelidir.
    Concrete methodlarin override edilme mecburiyeti yoktur.Istersek override edebiliriz,istemezsek etmeyiz
*Abstract bir parent'in concrate child class inherit ederse parent abstract class'ddaki tum abstract
        method'lari override etmek zorundadir.
        Abstract bir class, abstract baska bir class'i parent edinirse parent class'daki tum abstract methodlari
        override etmek ZORUNDA degildir.
*corolla class'in  2 tane Parent'i var ,corolla parent'larini ikisinin de standartlarina '(abstract method)
    uymak zorundadir.Concrate bir class parent'i olan tum abstract clas'larda abstract olan method'lari implement
    etmek ZORUNDADIR.
    Ancak parent silsilesinde override edilerek concrete yapilan methodlari override etmek zorunda degildir.
* bir abstract class concrete class'i parent edinebilir
*Abstract class'lar cosructor barindirir ama obje uretemezler.Abstract bir class'in ozelliklerini tasiyan bir obje
olusturmak istedigimizde Data turunu istedigimiz abstract class, constructor 'i ise child'i olan concrete bir class'dan
seceriz.














*/
}
