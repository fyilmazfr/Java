package day39_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_IOException {
    public static void main(String[] args) throws FileNotFoundException {
        /*javada bilgissayarimizdaki bir dosyaya erismek istiyorsak FileInputStream Class'indan yardim aliriz.
        Ayni sekilde Javadan bilgisayarimizda ki bir dosyaya ekleme veya update yapmak istersek FileOutputStream
        Class'indan yardim aliriz.
        FileInputStream  den yararlanabilmemiz icin obje olusturmamiz gerkiyor
         */
        FileInputStream fis=new FileInputStream("src/day39_Exceptions/Test.txt");
    }/*goruldugu gibi compile time'da altini kirmizi cizen her durum Compile time error degildir, Java'da bazi
    exceptionlar da Compile time exception'dir.ozellikle dosya okuma ve yazma ile ilgili exceptionlar compile time
     exceptiondur
     Cte olustugunda Java cozum icin 2 ihtimal onerir
     1- try-catch ile cevrelemek
     2- method signature'ina throws keyword ile beklenen exception turunu yazmak

     throws exception, sadece olayin farkinda oldugumuzun deklarasyonudur.exception'in handle edilmesinde
     hicbir rolu yoktur. Yani try-catch ile kontrol altina aldigimiz exception'lar da kod calismaya devam ediyordu
     Ancak throws exceptions yazdigimizda java bir exception ile karsilasirsa hicbir sey yapmamisiz gibi hata mesaji
     yayinlayip,calismayi durdurur


     */
}
