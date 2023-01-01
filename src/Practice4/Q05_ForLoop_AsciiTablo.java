package Practice4;

public class Q05_ForLoop_AsciiTablo {//0-255 e kadar olan harflerin sayi veya harf degerini ekrana yazdiriniz(aski tablosu)

    public static void main(String[] args) {
        for (int i = 0; i < 255; i++) {
            char c = (char) i;//java once integer bir degeri char'a cevirmeyi kabul etmez,uzerine gelip tiklarsak bizim
            //yerimize yazacaktir,burda cating yapmis olduk
            System.out.println(i + "-->>" + c);

        }

        //birde while ile cozelim
        System.out.println("while ile");
        int i=0;
        while (i<255){
            char sembol= (char) i;
            System.out.println(i+" : "+sembol);
            i++;//bunu yazmazsak sonsuz donguye girer

        }

        System.out.println("do while ile");
        int a=0;
        do {
            char karakter=(char) a;
            System.out.println(a+" "+ karakter);
            a++;

        }while (a<255);



    }
}
