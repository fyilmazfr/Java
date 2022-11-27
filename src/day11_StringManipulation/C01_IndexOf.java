package day11_StringManipulation;

public class C01_IndexOf {
    public static void main(String[] args) {
        String str="Java ogrenmek cok guzel";
        System.out.println(str.indexOf('g'));// 6 CHAR
        System.out.println(str.indexOf("r")); //7 STRING
        System.out.println(str.indexOf("j")); // -1 YAZDIRIR CUNKU KUCUK j yoktur
        System.out.println(str.indexOf("mek")); // 10 java burda ilk mek kalibini arar ve bulunca m nin basladigi
        // indexi yazdirir

        // eger istedigimiz indexten sonrasini kontrol etmek istersek ozaman ayni methodu iki parametreli olarak
        // kullanabiliriz

        System.out.println(str.indexOf("g",(6+1)));
        //yukaridaki str de 2. ve 3. nun indexlerini bulun
        // 2.ci e yi bulabilmek icin 1 enin indexine ihtiyacim var

        int ilke=str.indexOf("e");
        int ikincie=str.indexOf("e" ,ilke+1);
        //
        if (ikincie==-1) {
            System.out.println("verilen str da ikinci e yok");
        }else {
            int ucuncue=str.indexOf ("e", ikincie+1);
            if (ucuncue==-1) {
            System.out.println("verilen str da 3. e yoktur");
            } else {
                System.out.println("verilen str de 3. enin index'i: + ucuncue");
            }

    }
}}
