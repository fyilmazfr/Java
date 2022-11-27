package day12_StringManipulation;

public class C04_1_Substring { //SORU isim ve soy ismin ilk harfi buyuk harf geriye kalanlari * gorunsun
    // kredi kartinin ilk 4 rakami gorunsun geriye kalani * gorunsun
    public static void main(String[] args) {


        String isim = "fatih";
        String soyisim ="yilmaz";
        String kartNo = "1234 1234 1234 1234";
        String dogumTR = "01.03.1960";

        String isimilkharf = isim.substring(0, 1).toUpperCase();
        String isimgeriyekalan = isim.substring(1, 5).replaceAll("\\w", "*");
        System.out.println(isimilkharf + isimgeriyekalan);

        String soyisimIlkharf=soyisim.substring(0,1).toUpperCase();
        String soyisimgeriyekalan=soyisim.substring(0,5).replaceAll("\\w","*");
        System.out.println(soyisimIlkharf+soyisimgeriyekalan);


        String kartnoilkrakam=kartNo.substring(0,5);
        String kartnogeriyekalan=kartNo.substring(5).replaceAll("\\d","*");
        System.out.println(kartnoilkrakam+kartnogeriyekalan);



    }

}
