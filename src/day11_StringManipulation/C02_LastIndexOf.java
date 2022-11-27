package day11_StringManipulation;

public class C02_LastIndexOf {
    public static void main(String[] args) {
        //VERILEN KELIME ICIN ASAGIDAKI SARTLARDAN UYGUN OLANI YAZAN BIR PROGRAM YAZINIZ
        // _ VERILEN KELIME CUMLEDE KULLANILMAMIS
        // _ VERILEN KELIME CUMLEDE SADECE 1 KERE KULLANILMIS
        // _ VERILEN KELIME CUMLEDE BIRDEN FAZLA KULLANILMIS

        String cumle = "Java cok kalay, Java cok guzel";
        String kelime = "Java";

        int kelimeilkindex = cumle.indexOf(kelime); // cumlenin icinde ilk java  kelimesini ariyacak
        int kelimeSonIndex = cumle.lastIndexOf(kelime);

        if (kelimeilkindex==-1) {
            System.out.println("VERILEN KELIME CUMLEDE KULLANILMAMIS");
        }else if (kelimeilkindex==kelimeSonIndex){ // ILK JAVADAN SONRA IKINCI KERE JAVA KELIMESI VARMI BAKACAK?
            // esitse sadece bir kere kullanilmis, degilse kelime birden fazla kullanilmis ve asagiya sout a gececek

            System.out.println("VERILEN KELIME CUMLEDE SADECE 1 KERE KULLANILMIS");

        }else {
            System.out.println("VERILEN KELIME CUMLEDE BIRDEN FAZLA KULLANILMIS");
        }

}}
