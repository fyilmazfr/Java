package day12_StringManipulation;

public class C01_replace {// Bu gun ha va cok gu zel ?CUMESINI REPLACE yaparak Bugun Java cok guzel yapalim

    public static void main(String[] args) {
        String str="Bu gun ha va cok gu zel";


        System.out.println(str.replace(" ", "" ));
       str=(str.replace(" ", "" ));
        System.out.println(str.replace('h','J'));
        str=(str.replace('h','J'));
        System.out.println(str.replace(" ",""));






    }
}
