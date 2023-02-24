package day40_exceptions_Final;

public class A {
    String isim="cuneyt";
    final static String OKUL="yildiz koleji";
    /*
    bir variable final olarak tanimlandiysa baska class'lardan veya icinde oldugumuz class'dan bu variable'a baska
    deger atanmasi mumkun degildir
    Madem ki degeri degistirilemiyor genelde static de yaparak bu variable'e erisim kolaylastirilabilir
    Genelde static final olarak belirlenen variable isimleri Buyuk Harfle yazilir.
     */

    final void finalMethod(){
        System.out.println("final methodlar overrride edilemez");
        //bir method'u final olarak isaretlerseniz bu method degistirilemez demektir(override edilemez)
    }
}
