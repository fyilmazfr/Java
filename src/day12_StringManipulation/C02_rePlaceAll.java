package day12_StringManipulation;

public class C02_rePlaceAll {
    public static void main(String[] args) {
        String str="1Bu2gu3n Ja" +
                "va cok g3uz/el";
        str=str.replaceAll("\\s", "fatih");
        System.out.println(str);


        str=str.replaceAll("\\d", "");
        System.out.println(str);

        str=str.replaceAll("\\W","");
        System.out.println(str);


        str=str.replaceAll("fatih"," ");
        System.out.println(str);





    }
}
