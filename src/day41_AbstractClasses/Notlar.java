package day41_AbstractClasses;

public class Notlar {/*
*Abstract class, genellikle ortak ozellikleri olan nesneleri tek bir cati altinda toplamak icin kullanilir.
*abstractlar bi standar class'laridir.KENDILERINDEN OBJE OLUSTURULMAZ.
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
*
















*/
}
