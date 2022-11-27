package day12_StringManipulation;

public class C01_Empty {// verilen string in uzunlugu 0 ise true yoksa false yazdirir

    public static void main(String[] args) {


        String str = " calisirsaniz java ogrenmek cok kolay";
        System.out.println(str.isEmpty()); // FALSE
        String str2="";
        System.out.println((str2.isEmpty())); //true
        String str3=null;
        System.out.println(str3.isEmpty());// hata verir? .NullPointerException
    }

}
