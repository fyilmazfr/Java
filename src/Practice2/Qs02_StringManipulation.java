package Practice2;

public class Qs02_StringManipulation {// asagidaki verilen string fiyatlari toplayiniz
    // String str1="$13.99"
    // string str2="$10.55"

    public static void main(String[] args) {

        String str1="$13.99";
        String str2="$10.55";

        str1=str1.replaceAll("\\D","");
        str2=str2.replaceAll("\\D","");
        //System.out.println(str1);    ISTERSEK yazdiralim
       // System.out.println(str2);   ISTERSEK yazdiralim
        
        double sayi1=Double.parseDouble(str1);
        double sayi2=Double.parseDouble(str2);
        double toplam=(sayi1+sayi2)/100;
        System.out.println("$"+toplam);





    }



}
