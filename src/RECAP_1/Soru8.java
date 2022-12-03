package RECAP_1;

import java.util.Scanner;

public class Soru8 {/*kullanicidan yas bilgilerini alarak
        oy kullanma yasi:
        age >=18 ise oy kullanmaya uygun
        age>=70 UC kez oy kullanabilir
        70>age>=50 iki kez oy kullanabilir
        50>age>=18 Bir kez oy kullanabilir
         */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        int yas= scan.nextInt();
        if (yas>=18 && yas<50){
            System.out.println("oy kullanmaya uygun VE bir kez oy kullanabilir");

        }else if (yas>=50 && yas<70){
            System.out.println("iki kez oy kullanabilir");
        }else if (yas>=70){
            System.out.println("uc kez oy kullanabilir");
        }
    }
}
