package day38_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03 {//marketteki tum urunleri bir array'de tuttugumuzu varsayalim
    //kullaniciya index sorup o indekteki urunu yazdiran BIR program hazirlayalim.kullanici urun sayisindan buyuk bir index girerse
    //exception vermesinin onune gecelim

    public static void main(String[] args) {
        String[] urunler={"nutella","cokokrem","sut","cay","findik"};
        Scanner scan=new Scanner(System.in);
        System.out.println("istediginiz urunun sira numarasini giriniz");//Exception in thread "main" java.util.InputMismatchException
        int istenensira=0;
        try {
            istenensira= scan.nextInt();
        } catch (InputMismatchException deneme) {//catch bulogunun onundeki parantezde exception clas'inin ismi ve yaninda o class'dan
            //yakalanan exception'u atadigimiz variable'in ismi olur(e) eger yakalanan exception ile ilgili bilgileri kullaniciya vermek isterseniz
            //bu objeyi kullanabilirsiniz. eger exc ile ilgili kullaniciya bilgi verme ihtiyaci yoksa e kullanilmasa da kod calisir
            System.out.println(deneme.getMessage());//null VERDI , yada

            System.out.println("urun indexi icin tamsayi girmeniz gerekli");
        }

        try {
            System.out.println(urunler[istenensira]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("fazla sayi girdiniz");
        }
    }}
