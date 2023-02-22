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

  File input/Output exceptions
*bilgisayariniza disardan bir dosyayi almak, yada icerden disariya dosya aktarimi yapmaya denir.
* FileInputStream  den yararlanabilmemiz icin obje olusturmamiz gerkiyor
  FileInputStream fis=new FileInputStream("src/day39_Exceptions/Test.txt");//tesxt'in referansini icine yazdik
  public static void main(String[] args) throws FileNotFoundException //ve java bize uyari verdi,throws yazdi

*Goruldugu gibi compile time'da altini kirmizi cizen her durum Compile time error degildir, Java'da bazi
    exceptionlar da Compile time exception'dir.ozellikle dosya okuma ve yazma ile ilgili exceptionlar compile time
     exceptiondur.
     Cte olustugunda Java cozum icin 2 ihtimal onerir
     1- try-catch ile cevrelemek
     2- method signature'ina throws keyword ile beklenen exception turunu yazmak

     throws exception, sadece olayin farkinda oldugumuzun deklarasyonudur.exception'in handle edilmesinde
     hicbir rolu yoktur. Yani try-catch ile kontrol altina aldigimiz exception'lar da kod calismaya devam ediyordu
     Ancak throws exceptions yazdigimizda java bir exception ile karsilasirsa hicbir sey yapmamisiz gibi hata mesaji
     yayinlayip,calismayi durdurur.

     Ic ice TryCatch

     public class C02_IcIceTryCatch {
    public static void main(String[] args) {
        int k;
        try {
            FileInputStream fis=new FileInputStream("src/day39_Exceptions/Test.txt");//obje olusturduk

            while ((k=fis.read())!=-1) {//harfleri tek tek okur ve okuyacagi birsey kalmazsa -1 dondurur.
                System.out.print((char) k);//burda read kisminin altini cizer java bize ya okuyamazsam der
                // ve bizde tekrar try-catch yapariz.
            }

        } catch (FileNotFoundException e) {
            System.out.println("dosya bulunamadi");
        } catch (IOException e) {//2. CATCH BLOGUMUZ
            System.out.println("dosyadan bilgiler okunamadi");
        }
java'da 39.gundeyiz.
Biz Java'yi cok sevdik.
Umarim o da bizi sevmistir.
Process finished with exit code 0   YAZDIRDIK

*catch (IOException e) BU KISIM DAHA GENIS KAPSAMLIDIR Yani en genel exception'dir.
En buyugu ise exception'dir.yani bize derki senin dosyanda codunda exceptin var der.hatay spesifik olarak yakalamak
istiyorsak kademeli gitmeliyiz

* kullanicidan string bir deger alip bunu integera ceviriyorsak NumberFormatException ile karsilasabilecegimizi
ongoruruz NFE aldigimizda kodun durmamasini istiyoesak try-catch ile cevreleyebiliriz
eger bilmedigim bir exception daha olusursa kodum durmasin istiyorsak birkere daha catch cumlesi ekleyebilir onada
 en genis Exception'i yazabiliriz.

 public static void main(String[] args) {

        String str="123a5";
        int sayi=Integer.parseInt(str);
     try {
            System.out.println("sayinin karesi: "+sayi*sayi);
        } catch (NumberFormatException e) {
            System.out.println("yazdiginiz deger saddece rakamlardan olusmalidir");
        }catch (Exception e) {
            System.out.println("ONGORULEMEYEN BIR HATA OLUSTU");
    }
*




















*/
}
