package OrnekSorularARRAYS_slymn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class soru2 {//tom ve ahmet haric ekrana yazdir
    public static void main(String[] args) {
        String[] brr = {"ahmet", "fatih", "melih", "tom", "senih", "meva"};
        for (String each:brr) {

            if (each.equals("ahmet") || each.equals("tom")){
                continue;

            }
            System.out.println(each+" ");

        }
        System.out.println();
//soru:3:: (Kullanici ile beraber bir array olusturunuz,ve icine data yukleyiniz )
// bir ogretmenin sinifindaki ogrencilerin isimlerini
        //aplicationa yuklemesini saglayan kodu yaziniz.

        Scanner input=new Scanner(System.in);
        System.out.println("kac ogrenci ismi gireceksiniz");
        int numofStd= input.nextInt();

        String []names=new String[numofStd];

        for (int i = 1; i <=numofStd ; i++) {
            System.out.println("lutfen "+i+".ogrencinin ilk ismini giriniz");
            String stdName= input.next();
            names[i-1]=stdName;

        }
        System.out.println(Arrays.toString(names));

        }


        }







