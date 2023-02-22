package day39_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_IcIceTryCatch {
    public static void main(String[] args) {
        int k;
        try {
            FileInputStream fis=new FileInputStream("src/day39_Exceptions/Test.txt");

            while ((k=fis.read())!=-1) {//harfleri tek tek okur ve okuaycagi birsey kalmazsa -1 dondurur.
                System.out.print((char) k);//burda read kisminin altini cizer java bize ya okuaymazsam der
                // ve bizde tekrar try-catch yapariz.
            }

        } catch (FileNotFoundException e) {
            System.out.println("dosya bulunamadi");
        } catch (IOException e) {
            System.out.println("dosyadan bilgiler okunamadi");
        }
    }
}
