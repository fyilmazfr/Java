package Practice4;

import java.util.Scanner;

public class Q03_MethodCreation_Fibonacci {/*kullanicidan alinan bir tam sayi kadar (47 den kucuk) Fibonacci dizisini olusturun
                ornek ; 0-1-1-2-3-5-8-13-21-34...
    fibonacci kendisinden once ki iki sayinin toplamiyla olusur*/


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 47den kucuk bir tam sayi giriniz");
        int sayi= scan.nextInt();


        fibonacci(sayi);

        }

    public static void fibonacci(int sayi) {
        int sayi1=0;
        int sayi2=1;
        int sayi3;//sayi 3'u buraya assign ettik bos deger suan
        System.out.print(sayi1+" ");
        System.out.print(sayi2+" ");//0 1 1 2 3 5 8 13 21 34

        if (sayi<47){
            for (int i = 2; i <sayi ; i++) {
                sayi3=sayi1+sayi2;
                System.out.print(sayi3+" ");
                sayi1=sayi2;//her seferinde yenilemek icin
                sayi2=sayi3;

            }

    }else
            System.out.println("GECERSIZ SAYI");


}
}
