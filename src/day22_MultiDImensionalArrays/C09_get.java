package day22_MultiDImensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C09_get {
    public static void main(String[] args) {
        List<Integer> sayilar1=new ArrayList<>();
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);

        List<String> isimler=new ArrayList<>();
        isimler.add("fatih");
        isimler.add("bahtinur");
        isimler.add("senih");

        isimler.get(2);// 2.elementi getir dedik ama java bunu getirir ama bize gostermez,bunun yerine
        System.out.println(isimler.get(2));//senih , simdi yazdirdi
        //birde sayilardan getirelim
        System.out.println(sayilar1.get(1));//3 getirdi bize
    }
}
