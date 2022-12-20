package day21_Arrays;

import java.util.Arrays;

public class C08_binarySearch {//bu method javada eleman aramanin kisa yoludur ancak binarysearch un calismasi icin
    //Once array'in sirali hale getirilmesi lazim.Eger siralama yapmadan binary search yaparsaksonucu bulamayabilir
    // veya yanlis bulabiliriz
    public static void main(String[] args) {
        String[] harfler={"Y","8","D","G","0","A"};
        String arananHarf="A";
        System.out.println(Arrays.binarySearch(harfler,arananHarf));//aranan harfi harflerin icinde bul
        //binary search bize aradigimiz elemanin index'ini dondurur
        // array sirali olmadigi icin dogru sonucu vermeyebilir buyuzden once Sort yapmaliyiz
        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler));//siralama degisti [0, 8, A, D, G, Y]
        System.out.println(Arrays.binarySearch(harfler,arananHarf));//2 verdi,yani A yeni siralamada 2.index'de
    }

}
