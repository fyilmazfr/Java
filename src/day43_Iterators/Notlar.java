package day43_Iterators;

public class Notlar {}/*OTELEME
*Java iterator, collection elemanlarimizin arasina gezinmemize ve elemanlari degistirmemize yarar.
*Collections'da her element index yapisini desteklemez ,index olmadan tum elementlere ulasmak icin for-each loop
kullanabiliriz ancak for-each loop ile elementleri kalici olarak degistirme veya silme imkani olmadigi icin Iterator
kullanimi tercih ederiz.
*java index yapisi olmayan collection'lardaki elementlere ulasmak veya degistirmek icin Iterator interface'ini
olusturmustur.
Iterator interface oldugundan ondan obje uretmemiz mumkun degildir.Bunun yerine bize iterator donduren
liste.listIterator() methodunu kullaniyoruz

 Iterator it1=liste.listIterator();
            System.out.println(it1.next());//10
            System.out.println(it1.next());//20
            System.out.println(it1.next());//30

*iterator'da geri donus yok . adim adim sona ulastiktan sonra basa gelmek isterseniz yeniden bir iterator
            olusturmaniz gerekir
           bu durumda yeni bir iterator olusturmaliyim
*goruldugu gibi iterator kullanarak yapabildigim ;
        1- tum collection elementlerini yazdirmak
        2- tum collection elementlerini silmek
          buda bize yetmez

        it1.remove();
        it1.remove();
        it1.hasNext();
*
 public static void main(String[] args) {

        List<Integer> liste=new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);

        System.out.println(liste);
        Integer temp;
        ListIterator lit1=liste.listIterator();
        while (lit1.hasNext()){
            temp=(Integer)lit1.next()+3;//casting yaptik PARANTEZ ICINDE

            lit1.set(temp);

        }
        System.out.println(liste);//[13, 23, 33]




    ListIterator Iterator interface'inin child interface'dir
    ama daha cok method'a sahiptir

*uzerine aldigi elementi remove() ile silebilir,istersek yazdirabilir veya set() ile degistirebiliriz.
*Java da iki iterator kullaniriz. iterator class'i sadece 3 method barindirdigi icin cok kullanisli degildir.
sadece ikeri dogru gider ,remove ile element silebilir veya yazdirabilir
*ListIterator ise iterato'in child' olmasina ragmen daha fazla method barindirir.Ileri ve geri hareket edbilir,
set() ile elementleri degistirebiliriz.
*hasNext() ve hasPrevious() methodlari yaninda element oldugu muddetce bize true dondurur, bu methodlari while loop ile
kullanarak ileri ve geri olarak tum elementler uzerinde gezinebiliriz
*Ierator ve ListIterator interface olduklarindan direk obje uretemeyiz, bunun yerine bize iterator veya listIterator
 dondurecek method'lar kullaniriz.
 *
 public static void main(String[] args) {
        List<Integer> liste=new ArrayList<>();
        liste.add(2);
        liste.add(13);
        liste.add(56);
        liste.add(23);
        liste.add(45);
        liste.add(14);
        liste.add(40);
        //sondan basa glebilmek icin once sona gitmek lazim
        ListIterator li1=liste.listIterator();//listIterator olusturduk
        System.out.println(liste);
        while (li1.hasNext()){//bir sonrakinde element olana kadaar,oldugu muddetce devam et
            li1.next();
        }
        //bu loop bizi sona goturur
        while (li1.hasPrevious()){

            System.out.print(li1.previous()+" ");//40 14 45 23 56 13 2
       */

