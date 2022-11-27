package day04;

public class C04_ExplicitNarrowing {// daraltma islemi,java bunlari calisttiracagi ana kadar bilmez,ve risk almaz,
    //riski sifira indirmek icin degerin onune parantez icerisinde istedigimiz data turunu yazmamiz yeterlidir
    public static void main(String[] args) {
        int sayi1=500;
        short sayi2=(short) sayi1;
        System.out.println(sayi2);
    }

}
