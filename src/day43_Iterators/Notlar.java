package day43_Iterators;

public class Notlar {/*OTELEME
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



    /*
    ListIterator Iterator interface'inin child interface'dir
    ama daha cok method'a sahiptir
*/
}
