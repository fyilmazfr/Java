package day10_StringManipulation;

import java.util.Locale;

public class C02_toLowerCase_toUpperCase {
    public static void main(String[] args) {

        String str="beni piskopata baglamayin";
        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr")));

    }
}
