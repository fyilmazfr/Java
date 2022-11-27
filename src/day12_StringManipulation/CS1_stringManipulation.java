package day12_StringManipulation;

public class CS1_stringManipulation { // string metodlarini kullanarak "Java ogrenmek123 Cok guzel@" stringini
    //Java ogrenmek cok guzel" sekline getirin

    public static void main(String[] args) {
        String str="Java ogrenmek123 Cok guzel@";
        str=str.replaceAll(" ","FATIH");
        str=str.replaceAll("\\d","");
        str=str.replaceAll("\\@","");
        str=str.replaceAll("C","c");
        str=str.replaceAll("FATIH"," ");
        System.out.println(str);

    }
}
