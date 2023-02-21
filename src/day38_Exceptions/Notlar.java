package day38_Exceptions;

public class Notlar {/* Exception (Istisnalar)
*handil edilmek;
Java'da bir program calistirildiginda farkli sorunlar olusabilir.Bu sorunlarin olmamasi icin exception kullaniriz.
(stops execution) ve (throws an exception);Exception firlatmak
*Sorunlari cozmek icin try-catch block kullaniriz.
*bir sorunla karisilasmayi beklediginiz noktalarda if else ile bu sorunu cozebilirsiniz
 ama sorunu her zaman bu sekilde cozemeyecegimizden Java try-catch bloklari olusturmustur

 *try blogu yapmaya calistigimiz ama risk oldugunu dusundugumuz islemleri yazmak icin kullanilir.
catch'den sonraki parantez karsilasmayi bekledigimizexception turunu javaya soylemek icin kullanilir.
catch blogu; Java'ya soyledigimiz exception (istisnai durum) gerceklesirse java'nin yapmasini istedigimiz islem.

*(Exception e); bu exception'larin parent class'idir.burda tum exc.methodlari da bulunur.
*catch blogunun onunde ki paranteze karsilasmayi bekledigimiz exception'lari yazabiliriz veya her turlu
exception'da devreye girmesini istiyorsak tum exceptionlarin parent'i olan EXCEPTION yazabiliriz.

*yukari kisimda code, surround With ,kismindan try-catch bloguna ulasabiliriz.

*Process finished with exit code 0  ; bu ifade codumuzun calistigini bize soyler
*e.printStackTrace(); = eger bu ifadeyi silersek run yaptigimizda gorecegimiz kirmiziliklar ekrandan yok olur.
*e   = bu ifade bir variable'dir. bunu degistirip istedigimiz ismi verebiliriz.
catch blogunun onundeki parantezde exception clas'inin ismi ve yaninda o class'dan
yakalanan exception'u atadigimiz variable'in ismi olur(e) eger yakalanan exception ile ilgili bilgileri kullaniciya
vermek isterseniz bu objeyi kullanabilirsiniz. eger excp ile ilgili kullaniciya bilgi verme ihtiyaci yoksa   e
kullanilmasa da kod calisir

*System.out.println(deneme.getMessage());//null VERDI
*e. variable' baska bir yerde kullanilmaz ayni scop icinde kullanmamiz gerekir
*e. yazinca ilgili clas'dan gelen tum methodlari gorebiliriz
*e.printStackTrace(); bunu da yazarsak tum kirmizili ifadeler ekranda gorulur
*try bloklarindan sonra mutlaka catch yada finaly bloklari olmak zorundadir.tek basina calismaz












*/
}
