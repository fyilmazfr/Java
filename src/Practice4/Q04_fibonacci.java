package Practice4;

import java.util.Scanner;

public class Q04_fibonacci {/*kullanicidan alinan bir tam sayi kadar (25 DEN KUCUK) Fibonacci dizisini olusturun ,method ile
                ornek ; 0-1-1-2-3-5-8-13-21-34...
    fibonacci kendisinden once ki iki sayinin toplamiyla olusur*/

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tam sayi giniz ");
        int sayi= scan.nextInt();

        Fibonacci(sayi);

    }

    public static void Fibonacci(int sayi) {
        if (sayi<25){
            int sayi1=0;
            int sayi2=1;
            int sayi3;
            System.out.print(sayi1);
            System.out.print(sayi2);//foorloop a girmeden once sayi1ve Sayi2 yazdirmak zorundayiz

            for (int i = 2; i <sayi ; i++) {//0ve1 yukarda yazdirdik bu yuzden 2den baslasin
                sayi3=sayi1+sayi2;

                System.out.print(sayi3);

                sayi1=sayi2;//herdefasinda donguyu basa almak icin bunu yapariz
                sayi2=sayi3;





            }

        }else{
            System.out.println("gecerli sayi giriniz");
        }
    }
}
