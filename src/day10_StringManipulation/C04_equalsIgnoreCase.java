package day10_StringManipulation;

public class C04_equalsIgnoreCase {
    public static void main(String[] args) {
        String isim1="Ali Can";
        String isim2="ali can";
        System.out.println(isim1.equalsIgnoreCase(isim2)); //true yazdirir
        // VERILEN IKI STRING DEGISKENI BUYUK HARF veya kucuk harf gozetmeksizin karsilastirir ve true yazdirir
        // fakat bunun disinda herhangi bir karakter farkliligi oldugunda equals methodunda oldugu gibi FALSE yazdirir


        String str1="Ali Can";
        String str2="ali can";
        String str3="ALI CAN";
        String str4="Ali Can_";
        System.out.println(str1.equals(str2)); //false yazdirir
        System.out.println(str1.equalsIgnoreCase(str2)); //true yazdirir

        System.out.println(str2.equals(str3)); //FAlse yazdirir
        System.out.println(str2.equalsIgnoreCase(str3)); //true

        System.out.println(str1.equals(str4));//false
        System.out.println(str1.equalsIgnoreCase(str4));  //False yazdirir ,cunku sondaki alt cizgiden dolayi
        // false yazdirir.



    }
}
