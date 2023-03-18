package Java103104105Practice;

public class StringManipulation_Contains_Equals {
    /*
    contains;  metin icerisinde arama yapmamizi saglar, string'in icerisinde karakterlerin
    var olup olmadigini kontrol eder

    equals; 2 string metnin birbirine esit olup olmadigina bakar, buyuk kucuk harf farki vardir sonuc boolean'dir

    equalsIgnorecase; ayni islevi gorur tek farki buyuk kucuk harfe duyarliligi yoktur sonuc boolean'dir
     */
    public static void main(String[] args) {
        String str3="Merhaba";
        String str="Merhaba";

        boolean birebiresitMi=str3.equals(str);
        System.out.println("birebiresitMi = " + birebiresitMi);
        System.out.println(str.equals(str3));//t
        System.out.println(str.equalsIgnoreCase("MERHABA"));//t
        System.out.println(str.equals("merha"));//F
    }
}
