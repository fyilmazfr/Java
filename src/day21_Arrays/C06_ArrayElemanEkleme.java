package day21_Arrays;

import java.util.Arrays;

public class C06_ArrayElemanEkleme {//C05 deki methodu kullanarak array e eleman ekleme yapalim

    public static void main(String[] args) {
        String[] takimlistesi={"zeliha","mustafa"};
        String eklenecekIsim="irem";
        takimlistesi=C05_ArrayeElemanEkleme.elemanEkle(takimlistesi,eklenecekIsim);
        //C05 clas'indan eleman ekleme methodunu cagirdik ve takim listesi ve eklenecek ismi parantez
        //icine yazdik ki java bilsin diye yani eklenecek ismi takim listesine koy diyoruz

        System.out.println(Arrays.toString(takimlistesi));
    }
}
