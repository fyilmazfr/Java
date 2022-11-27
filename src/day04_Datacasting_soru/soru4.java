package day04_Datacasting_soru;

public class soru4 {// double 255.36 sayisini int'a sonra da olusturdugumuz int sayiyi byte'a cevirip yazdir

    public static void main(String[] args) {
        double sayi1=255.36;
        int sayi2=(int)sayi1;
        System.out.println(sayi2);
        Byte sayi3=(byte)sayi2;
        System.out.println(sayi3);

    }
}
