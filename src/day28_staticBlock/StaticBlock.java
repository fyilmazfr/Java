package day28_staticBlock;

public class StaticBlock {


    static int sayi;
    static {
        System.out.println("static blok calisti");
        sayi=10;
    }

    public static void main(String[] args) {
        System.out.println("main method calisti");
        System.out.println(sayi);

    }
    static {
        System.out.println("main method altindaki static block calisti");
    }

    // goruldigi gibi once static block calisti
    //sonra main method
    /* static block class olusturuldugunda calisir genellikle de class'la ilgili on ayarlamalar veya static variablelara
    deger atamak icin kullanilir

    static block larin class icerisinde nerede oldugu onemli degildir once static bloclar calisir
    birden fazla static block varsa yukaridan asagi dogru calisir
     */
}
