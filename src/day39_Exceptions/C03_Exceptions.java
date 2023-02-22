package day39_Exceptions;

public class C03_Exceptions {
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
}}
/*kullanicidan string bir deger alip bunu integera ceviriyorsak NumberFormatException ile karsilasabilecegimizi
ongoruruz NFE aldigimizda kodun durmamasini istiyoesak try-catch ile cevreleyebiliriz
eger bilmedigim bir exception daha olusursa kodum durmasin istiyorsak birkere daha catch cumlesi ekleyebilir onada
 en genis Exception'i yazabiliriz.

*/
