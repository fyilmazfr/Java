package Java103104105Practice;

public class MantikOperatorleri {
    public static void main(String[] args) {
        System.out.println(5+2==8);//false

        boolean sonuc1=(5>4 && 7<9 && 6+3==9 && 5+2!=8);
        System.out.println("sonuc1 ===>>"+sonuc1);//true


        boolean sonuc2=((5>4 && 7>9 && 6+3==9 && 5+2!=8) );
        System.out.println("sonuc2==>> "+sonuc2);//false
        //bir false gormesi false demesine yeter kodu durdurur devam etmez


        int sayi=15;
        //java 3'lu karsilastirma yapmaz,ikili karsilastirmalar yapip mantiksal operatorler ile
        //birlestirmeliyiz
        System.out.println(10<sayi && sayi<20);//true


        int sayi2=5;
        System.out.println("sayi2 10 ile 20 ararasinda degildir :"+(sayi2<20 || sayi2<10));


    }
}
