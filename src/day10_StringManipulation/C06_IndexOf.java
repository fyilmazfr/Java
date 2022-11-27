package day10_StringManipulation;

public class C06_IndexOf {
    public static void main(String[] args) {
        String str = "java ogrenmek cok guzel";
        System.out.println(str.indexOf(0)); // // -1 gosterir ,boyle bir deger yok anlami verir
        System.out.println(str.indexOf(2));
        System.out.println(str.indexOf(3));
        System.out.println(str.indexOf("4"));
        System.out.println(str.indexOf("j")); // saymaya 0 dan baslar
        System.out.println(str.indexOf("r"));
        System.out.println(str.indexOf("z"));

        String str2 = "hjfhjgfhjghghjgshhjgsfhjh    jhsfdhjhjfdshj";
        if (str2.indexOf("p") == -1) {

            System.out.println("str2 de istenen harf kullanilmamistir");


        }else {
            System.out.println("str2 de istenen harf kullanilmistir");

        }

    }}