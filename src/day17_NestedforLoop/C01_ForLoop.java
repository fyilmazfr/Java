package day17_NestedforLoop;

public class C01_ForLoop {// soru: VERILEN STRINDEKI KULLANILAN HARFLERI TEKRARSIZ OLARAK YAZDIRIP KELIMEDE KULLANILAN
    //FARKLI HARF SAYISINI VEREN BIR METHOD YAZINIZ
    public static void main(String[] args) {
        String input="java her zaman guzel";
        tekrarsizYap(input);
    }

    public static void tekrarsizYap(String input) {
        String benzersizInput=""; // bir kasa olusturduk, hiclik verdik 0 veremeyiz cunku string bir ifade
        String islenecekKelime=input.replaceAll("\\W" ,""); // bosluklari attik
        System.out.print(islenecekKelime.substring(0,1));  // J HARFI ICIN YAPTIK?ILK HARF

        for (int i = 1; i <islenecekKelime.length() ; i++) {
            if(!benzersizInput.contains(islenecekKelime.substring(i,i+1))){
                System.out.print(","+islenecekKelime.substring(i,i+1));
                benzersizInput+=islenecekKelime.substring(i,i+1);
            }

        }
        System.out.println("");
        System.out.println("input:"+" "+input);
        System.out.println("benzersiz input: "+" " +benzersizInput);

    }

}