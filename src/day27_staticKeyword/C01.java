package day27_staticKeyword;

public class C01 {/*
class level'da iki tur variable olusturabiliriz
static(class) variable
instance (obje) variable
static variable'lar tum class'dan kullanililabilirken
instance olanlar sadece static olmayan methodlarda direk kullanilabilir
instance variable'lara static methodan ulasmak istersek
obje olusturmamiz gerekir

instance variable'lar obje variable'i oldugu icin
herhangi bir satirda instance variable'in degerinin ne oldugunu bulmak icin OBJE OLUSTURULAN  satirdan
itibaren kod incelenmelidir

static variable'lar class variable'i oldugu icin herhangi bir satirda static variable'in degerinin ne oldugunu bulmak icin
CLASS'in BASINDAN  itibaren kod incelenmelidir
*/

    static  int sayi=10;
    int rakam=5;


    public static void main(String[] args) {
        C01 obj1=new C01();
        System.out.println("obj1'in rakam degeri:"+obj1.rakam);//5
        System.out.println("obj1'in sayi degeri:"+sayi);//10

        obj1.rakam+=1;// burda obj1den cagirirsak rakam degerinin 1 arttirilmasina izin verir
        sayi+=1;//java buna itiraz etmez cunku bu static

        System.out.println("1 arturildiktan sonra obj1'in rakam degeri:"+obj1.rakam);//6
        System.out.println("1 arturildiktan sonra obj1'in sayi degeri:"+sayi);//11

        C01 obj2=new C01();

        System.out.println("obj2'in rakam degeri:"+obj2.rakam);//5
        System.out.println("obj2'in sayi degeri:"+sayi);//11

        obj2.rakam++;
        obj2.sayi++;

        System.out.println("1 arturildiktan sonra obj2'in rakam degeri:"+obj2.rakam);//6
        System.out.println("1 arturildiktan sonra obj2'in sayi degeri:"+sayi);//12


    }
}
