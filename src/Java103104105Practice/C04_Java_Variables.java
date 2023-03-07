package Java103104105Practice;

public class C04_Java_Variables {
    /*
    farkli data turunde  variable olusturun ve bunlari yazdirin
     */
    public static void main(String[] args) {
        int x = 35;
        char ilkharf = 'F';
        String y = "fatih";
        boolean z = true;
        System.out.println(y + " " + x + "yasinda " + "dogrumu ?" + z);
//yada
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println("ilkharf = " + ilkharf);

        //soru; IKIfarkli tara turunde 2 variable olusturun ve bunlarin toplamini yazdirin
        System.out.println("");

        int dger1 = 20;
        byte deger2 = 30;
        System.out.println(dger1 + deger2);


        //soru;bir tam sayi ve bir ondalik variable olusturun bunlarin toplamini yazdirin

        int tamsayi = 20;
        double ondalik = 20.5;
        System.out.println(tamsayi + ondalik);

        //soru; char data turunde bir variable olusturun ve yazdirin

        char a = 'F';
        System.out.println(a);

        //soru;peki bir tamsayi ile bir harfi toplayabilirmiyiz

        int sayi=30;
        char harf='F';
        System.out.println(sayi+harf);//100 aski degerini verir
    }
}
