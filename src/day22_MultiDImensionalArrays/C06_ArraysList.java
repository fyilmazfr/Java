package day22_MultiDImensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C06_ArraysList {/* array'i array yapan sembol[] idi,
arrayList de ise <> diamonde (elmas ) kullaniriz.
*/

    public static void main(String[] args) {
        List<String> isimler=new ArrayList<>();// ArrayList yazmak zorundayiz
        System.out.println(isimler);//direk isimler yazmamiz yetiyor java bunu yazdirir
        //bir list'e eleman eklemek istersek
        isimler.add("fatih"); // fatih'i eklemis olduk bize tru yada false donecektir,eklendi yada eklenmedi mantigiyla

        System.out.println(isimler.add("melih"));//true doner
        System.out.println(isimler);//[fatih, melih] listeye ekledi
        //list'in tek kotu tarafi array'in alt yapisini kullandigi icin elemanlari birer birer eklemek gerekir


    }
}
